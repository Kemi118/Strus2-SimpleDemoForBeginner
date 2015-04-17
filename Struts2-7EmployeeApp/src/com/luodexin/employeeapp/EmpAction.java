package com.luodexin.employeeapp;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import com.opensymphony.xwork2.ModelDriven;

public class EmpAction  implements RequestAware , ModelDriven<Employee> {

	private Map<String, Object> requestMap;

	private Integer employeeId;
	
	private Employee employee;
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}

	@Override
	public Employee getModel() {
		if(employeeId == null){
			employee = new Employee();
		}else {
			employee = Dao.getEmployee(employeeId);
		}
		return employee;
	}

	
	public String list(){
		List<Employee> employees = Dao.getEmployeesList();
		requestMap.put("employees", employees);
		return "success";
	}
	
	public String delete(){
		Dao.deleteEmployee(employee.getEmployeeId());
		return "delete";
	}

	public String add(){
		Dao.addEmployee(employee);
		return "add";
	}

	public String edit(){
		Employee employee = Dao.getEmployee(this.employee.getEmployeeId());
		this.employee.setFirstName(employee.getFirstName());
		this.employee.setLastName(employee.getLastName());
		this.employee.setEmail(employee.getEmail());
		return "edit";
	}
	
	public String update(){
		Dao.updateEmployee(employee);
		return "update";
	}
	
}
