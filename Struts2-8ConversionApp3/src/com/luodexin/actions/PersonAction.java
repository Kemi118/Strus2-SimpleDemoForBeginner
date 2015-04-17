package com.luodexin.actions;

import com.luodexin.conversionapp.model.Custormer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PersonAction extends ActionSupport implements ModelDriven<Custormer>{

	private static final long serialVersionUID = 1L;

	private Custormer custormer;
	
	public PersonAction() {
		
	}
	
	
	public String execute(){
		System.out.println("execute......");
		return "time";
	}


	@Override
	public Custormer getModel() {
		custormer = new Custormer();
		return custormer;
	}
	
}
