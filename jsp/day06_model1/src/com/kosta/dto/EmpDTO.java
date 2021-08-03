package com.kosta.dto;

import java.sql.Date;

public class EmpDTO {
	private int employee_id;
	private String first_name;
	private String hire_date;
	private int salary;
	private int department_id;

	
	public EmpDTO(int employee_id, String first_name,String hire_date, int salary, int department_id) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.hire_date = hire_date;
		this.salary = salary;
		this.department_id = department_id;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	
}


