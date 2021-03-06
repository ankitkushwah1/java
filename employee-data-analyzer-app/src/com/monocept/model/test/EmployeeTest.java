package com.monocept.model.test;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import com.monocept.model.Employee;



public class EmployeeTest {
	static HashSet<Employee> employes = new HashSet<Employee>();
	static List<String> details  = new ArrayList<String>();
	public static void main(String [] args) {
		
		readFile();
		readFileFromUrl("https://swabhav-tech.firebaseapp.com/emp.txt");
		for(String detail :details) {
			
			String [] str = detail.split(",");
			
			Employee employee = new Employee(Integer.parseInt(StringConvert(str[0])),str[1],str[2],Integer.parseInt(StringConvert(str[3])),str[4],Double.parseDouble(StringConvert(str[5])),Double.parseDouble(StringConvert(str[6])),Integer.parseInt(StringConvert(str[7])));
			
			employes.add(employee);
		}

		System.out.println("Maximum Slaried employee is : "+findMaximumSalariedEmployee().getEmployeeName());
		System.out.println("Number of employees is  : "+employes.size());
	}
	
	public static void  readFile() {
		try {
			
			
			File file =  new File("./dataFile.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine())!=null) {
				details.add(line);
			}
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Employee findMaximumSalariedEmployee() {
		double max =0;
		Employee maxSalriedEmployee = new Employee();
		for(Employee employee: employes) {
			if(employee.getSalary() > max) {
				max=employee.getSalary();
				maxSalriedEmployee = employee;
			}
		}
		return maxSalriedEmployee;
	}
	public static String StringConvert(String str) {
		
		if(str.equals("NULL")) {
			
			return "0";
		}
		StringBuilder  sb = new StringBuilder(str);

		return sb.toString();
	}
	
		public static void readFileFromUrl(String purl) {
			
			StringBuilder  sb = new StringBuilder();
			
			try {
				
				URL url = new URL(purl);
				URLConnection urlConnection = url.openConnection();
				BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
				String line = null;
				while((line = reader.readLine())!=null) {
					details.add(line);
				}
				reader.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
