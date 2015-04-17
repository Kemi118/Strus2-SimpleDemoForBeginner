package com.luodexin.fileupdownload.bean;

import java.util.Date;

public class FileIterm {
	
	private int id;
	
	private String fileName;
	
	private String filePath;
	
	private long fileSize;
	
	private String fileDesc;
	
	private Date uploadDate;
	
	public FileIterm() {
		
	}

	public FileIterm(String fileName, String filePath, long fileSize,
			String fileDesc, Date uploadDate) {
		super();
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileSize = fileSize;
		this.fileDesc = fileDesc;
		this.uploadDate = uploadDate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileDesc() {
		return fileDesc;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	@Override
	public String toString() {
		return "FileIterm [id=" + id + ", fileName=" + fileName + ", filePath="
				+ filePath + ", fileSize=" + fileSize + ", fileDesc="
				+ fileDesc + ", uploadDate=" + uploadDate + "]";
	}
	
}
