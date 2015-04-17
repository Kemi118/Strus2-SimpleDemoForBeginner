package com.luodexin.fileupdownload.action;

import java.sql.Connection;
import java.util.List;

import com.luodexin.fileupdownload.bean.FileIterm;
import com.luodexin.fileupdownload.db.FileUpDownloadDAO;
import com.luodexin.fileupdownload.db.JDBCTools;
import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<FileIterm> fileIterms;
	
	public FileDownloadAction() {
		// TODO Auto-generated constructor stub
	}
	
	public List<FileIterm> getFileIterms() {
		return fileIterms;
	}
	public void setFileIterms(List<FileIterm> fileIterms) {
		this.fileIterms = fileIterms;
	}
	@Override
	public String execute() throws Exception {
		fileIterms = getAllfiles();
		return super.execute();
	}

	private List<FileIterm> getAllfiles() {
		
		FileUpDownloadDAO dao = new FileUpDownloadDAO();
		String sql = "SELECT * FROM files";
		Connection connection = null;
		try {
			connection = JDBCTools.getConnection();
			fileIterms = dao.getForList(connection, sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCTools.releaseDB(null, null, connection);
		}
		
		System.out.println("一共查询到"+fileIterms.size()+"条记录");
		return fileIterms;
	}
	
	
	
}
