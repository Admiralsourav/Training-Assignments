package com.cts.chainOfResponsibility.ChainedObject;

import com.cts.chainOfResponsibility.Handler.ILeaveRequestHandler;
import com.cts.chainOfResponsibility.Model.LeaveRequest;

public class HR implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {

		if(leaveRequest.getLeaveDays() > 5)
		{
			System.out.println("Contact HR for leaves greater than 5");
		}else {
			System.out.println("Leave is granted for " + leaveRequest.getEmployee());
		}
		
		
	}
	
	

}
