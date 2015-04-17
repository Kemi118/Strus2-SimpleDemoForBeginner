package com.luodexin.fileupdownload.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;
import com.luodexin.fileupdownload.bean.FileIterm;
import com.luodexin.fileupdownload.db.FileUpDownloadDAO;
import com.luodexin.fileupdownload.db.JDBCTools;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<File> file;
	private List<String> fileFileName;
	private List<String> fileContentType ;
	private List<String> fileDesc;
	
	private List<FileIterm> fileIterms;
	
	public FileUploadAction() {
	}
	
	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	public List<String> getFileDesc() {
		return fileDesc;
	}

	public void setFileDesc(List<String> fileDesc) {
		this.fileDesc = fileDesc;
	}

	@Override
	public String execute() throws Exception {
		
		fileIterms = new ArrayList<>();
		
		doUpload(file,fileFileName,fileContentType,fileDesc,fileIterms);
		
		updateDB(fileIterms);
		
		return super.execute();
	}

	private void doUpload(List<File> file2, List<String> fileFileName2,
			List<String> fileContentType2, List<String> fileDesc2,
			List<FileIterm> fileIterms2) throws IOException {
		ServletContext context = ServletActionContext.getServletContext();
		String realPath = context.getRealPath("/files");
		
		for(int i=0 ; i < file2.size() ; i++){
			String path = realPath + "\\" 
					+ new Random().toString()
					+ fileFileName2.get(i);
			
			OutputStream out = new FileOutputStream(new File(path));
			InputStream in = new FileInputStream(file2.get(i));
			
			String fileName = fileFileName2.get(i);
			long fileSize = in.available();
			Date uploadDate = new Date();
			String desc = fileDesc2.get(i);
			FileIterm fileIterm = new FileIterm(fileName, path, fileSize, desc, uploadDate );
			
			byte[] buffer = new byte[1024];
			int len = 0;
			
			while(-1 != (len = in.read(buffer))){
				out.write(buffer, 0, len);
			}
			
			out.close();
			in.close();
			
			fileIterms2.add(fileIterm);
		}
		
	}
	//更新数据库
	private void updateDB(List<FileIterm> fileIterms2) {
		FileUpDownloadDAO dao = new FileUpDownloadDAO();
		
		String sql = "insert into files (fileName , filePath , fileSize , fileDesc , uploadDate ) values(?,?,?,?,?);";
		Connection connection = null;
		try {
			connection = JDBCTools.getConnection();
			for(FileIterm fileIterm : fileIterms2){
				String fileName = fileIterm.getFileName();
				String filePath = fileIterm.getFilePath();
				long fileSize = fileIterm.getFileSize();
				String fileDesc = fileIterm.getFileDesc();
				Date uploadDate = fileIterm.getUploadDate();
				dao.update(connection, sql, fileName , filePath , fileSize , fileDesc , uploadDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCTools.releaseDB(null, null, connection);
		}
		
		System.out.println(fileIterms2);
	}

}
