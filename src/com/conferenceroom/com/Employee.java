package com.conferenceroom.com;

public class Employee {
     int Employee_Id;
     String Employee_Name;
	public Employee(int employee_Id, String employee_Name) {
		super();
		Employee_Id = employee_Id;
		Employee_Name = employee_Name;
	}
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
     
     
}
