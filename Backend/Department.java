package com.greatlearning.service.Backend;

public enum Department {
	TECHNICAL ("Techinical"),
	ADMIN ("Admin"),
	HR ("Human Resource"),
	LEGAL("Legal");

	private String department;

	Department(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}
}