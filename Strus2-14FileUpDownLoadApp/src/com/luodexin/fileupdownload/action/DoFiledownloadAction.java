package com.luodexin.fileupdownload.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.luodexin.fileupdownload.bean.FileIterm;
import com.luodexin.fileupdownload.db.FileUpDownloadDAO;
import com.luodexin.fileupdownload.db.JDBCTools;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DoFiledownloadAction extends ActionSupport implements ServletRequestAware{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String contentType;
	private long contentLength;
	private String contentDisposition;
	private InputStream inputStream;
	
	private HttpServletRequest httpServletRequest;
	
	public DoFiledownloadAction() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContentType() {
		return contentType;
	}

	public long getContentLength() {
		return contentLength;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	@Override
	public String execute() throws Exception {
		
		httpServletRequest.setCharacterEncoding("utf-8");
		
		FileIterm fileIterm = getFileIterm(id);
		
		contentType = "text/txt";
		contentDisposition="attachment;filename="+fileIterm.getFileName();
		
		String filePath = fileIterm.getFilePath();
		inputStream = new FileInputStream(new File(filePath));
		
		contentLength = inputStream.available();
		
		return SUCCESS;
	}

	private FileIterm getFileIterm(int id2) {
		FileIterm fileIterm = null;
		FileUpDownloadDAO dao = new FileUpDownloadDAO();
		String sql = "SELECT * FROM files Where id = ?";
		Connection connection = null;
		try {
			connection = JDBCTools.getConnection();
			fileIterm = dao.get(connection, sql, id2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCTools.releaseDB(null, null, connection);
		}
		
		System.out.println(fileIterm);
		
		return fileIterm;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		httpServletRequest = request;
	}
}
