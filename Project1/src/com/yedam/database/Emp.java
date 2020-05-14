package com.yedam.database;

public class Emp {
	private int employee_id , salary;
	private String lastName, hireDate;
	public Emp(String lastName, String hireDate) {
		this.lastName = lastName;
		this.hireDate = hireDate;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public void showInfo() {
		System.out.println("사원 번호 " + employee_id + ", 성 " + lastName + ", 급여 "  + salary + ", 입사일 " +  hireDate);
	}
	
}
