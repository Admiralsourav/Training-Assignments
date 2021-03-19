package com.cts.chainOfResponsibility.Model;

public class LeaveRequest {

	public String Employee;
	public int leaveDays;
	
	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	
	
}
