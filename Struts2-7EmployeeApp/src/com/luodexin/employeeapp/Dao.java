package com.luodexin.employeeapp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dao {
	
	private static Map<Integer, Employee> employees;
	
	static{
		employees = new LinkedHashMap<>();
		employees.put(1001, new Employee(1001, "AA", "aa", "aa@outlook.com"));
		employees.put(1002, new Employee(1002, "BB", "bb", "bb@outlook.com"));
		employees.put(1003, new Employee(1003, "CC", "cc", "cc@outlook.com"));
		employees.put(1004, new Employee(1004, "DD", "dd", "dd@outlook.com"));
		employees.put(1005, new Employee(1005, "EE", "ee", "ee@outlook.com"));
		employees.put(1006, new Employee(1006, "FF", "ff", "ff@outlook.com"));
	}
	
	public static void addEmployee(Employee employee){
//		Integer employeeId = (int) System.currentTimeMillis();
		Integer employeeId = getEmployeesList().get(getEmployeesList().size()-1).getEmployeeId();
		employee.setEmployeeId(++employeeId);
		employees.put(employeeId, employee);
	}
	
	public static void deleteEmployee(Integer employeeId){
		employees.remove(employeeId);
	}
	
	public static  List<Employee> getEmployeesList(){
		return new ArrayList<>(employees.values());
	}
	
	public static Employee getEmployee(Integer employeeId){
		return employees.get(employeeId);
	}
	
	public static void updateEmployee(Employee employee){
		employees.put(employee.getEmployeeId(), employee);
	}
	
	
	
}
