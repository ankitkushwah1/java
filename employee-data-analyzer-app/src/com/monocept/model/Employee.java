package com.monocept.model;

import java.util.*;
public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private int managerId;
	private String dateOfJoining;
	private double salary;
	private double commision;
	private int departmentNo;
	
	
	public Employee() {
		
	}
	public Employee(int employeeId,String employeeName,String employeeDesignation,int managerId,String dateOfJoining,double salary,double commision,int departmentNo) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.managerId= managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commision = commision;
		this.departmentNo = departmentNo;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public int getManagerId() {
		return managerId;
	}
	
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getCommision() {
		return commision;
	}
	
	public int getDepartmentNo() {
		return departmentNo;
	}
	
	@Override
	public int hashCode(){
		
		int hashcode = 0;
		hashcode = departmentNo*20;
	    hashcode += employeeDesignation.hashCode();
	    return hashcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee employee = (Employee)obj;
		if(employee.employeeId == this.employeeId && employee.departmentNo == this.departmentNo && employee.employeeDesignation.equals(this.employeeDesignation) ) {
			return true;
		}
		return false;
	}
	
}
