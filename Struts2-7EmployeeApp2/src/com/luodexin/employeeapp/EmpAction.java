package com.luodexin.employeeapp;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmpAction  implements RequestAware , ModelDriven<Employee> , Preparable{

	private Map<String, Object> requestMap;
	
	private Employee employee;
	
	private Integer employeeId;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}

	@Override
	public Employee getModel() {
		return employee;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public String list(){
		List<Employee> employees = Dao.getEmployeesList();
		requestMap.put("employees", employees);
		return "success";
	}
	
	public String delete(){
		System.out.println(employeeId);
		Dao.deleteEmployee(employeeId);
		return "delete";
	}

	
	public void prepareAdd() {
		employee = new Employee();
	}
	
	public String add(){
		Dao.addEmployee(employee);
		return "add";
	}

	public void prepareEdit() {
		System.out.println("invoke prepareEdit");
		employee = Dao.getEmployee(employeeId);
	}
	public String edit(){
		return "edit";
	}
	
	
	public void prepareUpdate(){
		employee = new Employee();
		System.out.println("invoke prepareUpdate...");
	}
	
	public String update(){
		Dao.updateEmployee(employee);
		return "update";
	}

	@Override
	public void prepare() throws Exception {
		System.out.println("invoke prepare.....");
	}
	
}
