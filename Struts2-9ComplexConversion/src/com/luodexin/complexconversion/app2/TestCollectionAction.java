package com.luodexin.complexconversion.app2;

import java.util.Collection;

import com.luodexin.complexconversion.app1.model.Manager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TestCollectionAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Collection<Manager> mgrs = null;
	
	public TestCollectionAction() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TestCollectionAction(Collection<Manager> mgrs) {
		super();
		this.mgrs = mgrs;
	}
	

	public Collection<Manager> getMgrs() {
		return mgrs;
	}


	public void setMgrs(Collection<Manager> mgrs) {
		this.mgrs = mgrs;
	}


	@Override
	public String execute() throws Exception {
		System.out.println(mgrs);
		return SUCCESS;
	}
	

}
