package com.greatlearning.service.Client;

import java.util.Scanner;

import com.greatlearning.service.Backend.CredentialS;
import com.greatlearning.service.Module.Employee;

public class Main {	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int selectDepartment1 = 0;
		System.out.println("Please enter the department from the following \n"
				+ "1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resource \n"
				+ "4. Legal \n");

		selectDepartment1 = scan.nextInt();

		scan.close();

		Employee employee = new Employee("Hemanth", "Kumar T");
		employee.setDepartment(selectDepartment1);
		employee.setPassword();

		CredentialS.showCredentials(employee);
	}

}




