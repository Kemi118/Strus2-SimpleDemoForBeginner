package com.luodexin.complexconversion.app1;

import com.luodexin.complexconversion.app1.model.Department;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConversonAppAction extends ActionSupport implements ModelDriven<Department>{

	private static final long serialVersionUID = 1L;

	private Department department;
	
	@Override
	public Department getModel() {
		department = new Department();
		return department;
	}
	
	public String execute(){
		
		System.out.println(department);
		return "success";
	}

	
}
