package com.monocept.model;

import java.util.*;

public class EmployeeAnalyzer {

	static HashSet<Employee> employes = new HashSet<Employee>();
	static List<String> details = new ArrayList<String>();

	private Strategy strategy;

	public EmployeeAnalyzer(Strategy strategy) {
		this.strategy = strategy;
	
		
	}

	public  void executeStrategy() {
		this.strategy.read();
		for (String detail : details) {

			String[] str = detail.split(",");

			Employee employee = new Employee(Integer.parseInt(StringConvert(str[0])), str[1], str[2],
					Integer.parseInt(StringConvert(str[3])), str[4], Double.parseDouble(StringConvert(str[5])),
					Double.parseDouble(StringConvert(str[6])), Integer.parseInt(StringConvert(str[7])));

			employes.add(employee);
		}
	}

	public static String StringConvert(String str) {

		if (str.equals("NULL")) {

			return "0";
		}
		StringBuilder sb = new StringBuilder(str);

		return sb.toString();
	}

	public Employee getMaximumSalariedEmployee() {
		double max = 0;
		Employee maxSalriedEmployee = new Employee();
		for (Employee employee : employes) {
			if (employee.getSalary() > max) {
				max = employee.getSalary();
				maxSalriedEmployee = employee;
			}
		}
		return maxSalriedEmployee;
	}

	public Map getDeptWiseEmpCount() {
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (Employee employee : employes) {
			if (hmap.containsKey(employee.getDepartmentNo()))
				hmap.put(employee.getDepartmentNo(), hmap.get(employee.getDepartmentNo())+1);
			else
				hmap.put(employee.getDepartmentNo(), 1);
		}
		return hmap;
	}

	public Map getJobWiseEmpCount() {
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		for (Employee employee : employes) {
			if (hmap.containsKey(employee.getEmployeeDesignation()))
				hmap.put(employee.getEmployeeDesignation(), hmap.get(employee.getEmployeeDesignation())+1);
			else
				hmap.put(employee.getEmployeeDesignation(), 1);
		}
		return hmap;
	}
}
