package com.cts.chainOfResponsibility.ChainedObject;

import com.cts.chainOfResponsibility.Handler.ILeaveRequestHandler;
import com.cts.chainOfResponsibility.Model.LeaveRequest;

public class Supervisor implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = new ProjectManager();

	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {

		if(leaveRequest.getLeaveDays() <=3) {
			System.out.println("The leave request is been approved by Supervisor for " + leaveRequest.getEmployee());
		}
		else
		{
			nextHandler.HandleRequest(leaveRequest);
		}
		
	}

}
