package com.greatlearning.service.Client;

import java.util.Scanner;

import com.greatlearning.service.Backend.CredentialService;
import com.greatlearning.service.Module.Employee;

public class Main {	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int selectDepartment = 0;
		System.out.println("Please enter the department from the following \n"
				+ "1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resource \n"
				+ "4. Legal \n");

		selectDepartment = scan.nextInt();

		scan.close();

		Employee employee = new Employee("Hemanth", "Kumar");
		employee.setDepartment(selectDepartment);
		employee.setPassword();

		CredentialService.showCredentials(employee);
	}

}




