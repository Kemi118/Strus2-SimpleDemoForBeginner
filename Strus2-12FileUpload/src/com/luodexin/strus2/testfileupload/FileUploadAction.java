package com.luodexin.strus2.testfileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<File> file;
	private List<String> fileFileName;
	private List<String> fileContentType ;
	private List<String> fileDesc;
	
	public FileUploadAction() {
	}
	
	
	public FileUploadAction(List<File> file, List<String> fileFileName,
			List<String> fileContentType, List<String> fileDesc) {
		super();
		this.file = file;
		this.fileFileName = fileFileName;
		this.fileContentType = fileContentType;
		this.fileDesc = fileDesc;
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
		ServletContext context = ServletActionContext.getServletContext();
		String realPath = context.getRealPath("/files");
		
		System.out.println(file);
		System.out.println(fileFileName);
		System.out.println(fileContentType);
		System.out.println(fileDesc);
		System.out.println(realPath);
		
		doUpload(file,fileFileName,realPath);
		
		return SUCCESS;
	}


	private void doUpload(List<File> file2, List<String> fileFileName2,
			String realPath) throws IOException {
		for(int i=0 ; i < file2.size() ; i++){
			String path = realPath + "/" 
					+ new Random().toString()
					+ fileFileName2.get(i);
			
			OutputStream out = new FileOutputStream(new File(path));
			InputStream in = new FileInputStream(file2.get(i));
			
			byte[] buffer = new byte[1024];
			int len = 0;
			
			while(-1 != (len = in.read(buffer))){
				out.write(buffer, 0, len);
			}
			
			out.close();
			in.close();
			
		}
	}
	
	

}
