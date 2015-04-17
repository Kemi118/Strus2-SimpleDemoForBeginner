package com.luodexin.strus2.testfiledownload;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FiledownAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String contentType;
	private long contentLength;
	private String contentDisposition;
	private InputStream inputStream;
	
	public FiledownAction() {
		// TODO Auto-generated constructor stub
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
		
		contentType = "text/xml";
		contentDisposition="attachment;filename=home.html";
		
		ServletContext context = ServletActionContext.getServletContext();
		String pathname = context.getRealPath("/files/home.html");
		inputStream = new FileInputStream(new File(pathname));
		
		contentLength = inputStream.available();
		
		
		return SUCCESS;
	}
}
