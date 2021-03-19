package com.cts.chainOfResponsibility.client;

import java.util.Scanner;

import com.cts.chainOfResponsibility.ChainedObject.Supervisor;
import com.cts.chainOfResponsibility.Handler.ILeaveRequestHandler;
import com.cts.chainOfResponsibility.Model.LeaveRequest;

public class Program {

	public static void main(String[] args) {

		String employeeName;
		int leaveDays;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Name : : ");
		employeeName = sc.nextLine();
		System.out.println("Enter the number of days of leave : : ");
		leaveDays = sc.nextInt();
		
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee(employeeName);
		leaveRequest.setLeaveDays(leaveDays);
		
		ILeaveRequestHandler leaveRequestHandler = new Supervisor();
		leaveRequestHandler.HandleRequest(leaveRequest);
		
	}

}
