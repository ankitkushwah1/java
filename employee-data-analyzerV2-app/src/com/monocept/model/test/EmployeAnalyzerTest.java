package com.monocept.model.test;

import java.util.Map;

import com.monocept.model.Employee;
import com.monocept.model.EmployeeAnalyzer;
import com.monocept.model.FileLoader;
import com.monocept.model.UrlLoader;

public class EmployeAnalyzerTest {
	public static void main(String [] args) {
		EmployeeAnalyzer analyzer = new EmployeeAnalyzer(new FileLoader("data/dataFile.txt"));
		analyzer.executeStrategy();
		Employee emp = analyzer.getMaximumSalariedEmployee();
		printDetails(emp);
		Map<Integer, Integer> deptwiseCount = analyzer.getDeptWiseEmpCount();
		for(Map.Entry entry : deptwiseCount.entrySet()) {
			System.out.println(entry.getKey() +"  : "+entry.getValue());
		}
		
		Map<String, Integer> jobwiseCount = analyzer.getJobWiseEmpCount();
		for(Map.Entry entry : jobwiseCount.entrySet()) {
			System.out.println(entry.getKey() +"  : "+entry.getValue());
		}
	}
	
	public static void printDetails(Employee emp) {
		System.out.println("Employer name : "+emp.getEmployeeName());
		System.out.println("Employee Id : "+emp.getEmployeeId());
		System.out.println("Employee Department : "+emp.getDepartmentNo());
		System.out.println("Employee Designation : "+emp.getEmployeeDesignation());
		System.out.println("Employee Salary : "+emp.getSalary());
	}
	
	
}
