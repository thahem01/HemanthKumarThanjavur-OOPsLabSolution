package com.greatlearning.service.Client;

import java.util.Scanner;

import com.greatlearning.service.Backend.CredentialS;
import com.greatlearning.service.Module.Employee;

public class Main {	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Employee First Name : ");
		String firstName = scan.next();
		
		System.out.print("Enter Employee Last Name : ");
		String lastName = scan.next();
		
		int selectDepartment = 0;
		System.out.println("\nPlease enter the department from the following \n"
				+ "1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resource \n"
				+ "4. Legal");
		
		selectDepartment = scan.nextInt();
		
		scan.close();
		
		Employee employee = new Employee(firstName, lastName);
		employee.setDepartment(selectDepartment);
		employee.setPassword();
		
		CredentialS.showCredentials(employee);
	}
}