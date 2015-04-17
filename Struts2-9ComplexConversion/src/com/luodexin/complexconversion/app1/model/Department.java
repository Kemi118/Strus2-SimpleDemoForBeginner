package com.luodexin.complexconversion.app1.model;

public class Department {

	private Integer id;
	
	private Manager mgr;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(Integer id, Manager mgr) {
		super();
		this.id = id;
		this.mgr = mgr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Manager getMgr() {
		return mgr;
	}

	public void setMgr(Manager mgr) {
		this.mgr = mgr;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", mgr=" + mgr + "]";
	}
	
	
	
}
