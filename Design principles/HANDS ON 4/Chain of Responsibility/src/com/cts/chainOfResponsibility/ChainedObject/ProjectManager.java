package com.cts.chainOfResponsibility.ChainedObject;

import com.cts.chainOfResponsibility.Handler.ILeaveRequestHandler;
import com.cts.chainOfResponsibility.Model.LeaveRequest;

public class ProjectManager implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = new HR();
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		
		if(leaveRequest.getLeaveDays() >3 && leaveRequest.getLeaveDays()<=5) {
			System.out.println("leave has been approved by project manager for " + leaveRequest.getEmployee());
		}
		else
		{
			nextHandler.HandleRequest(leaveRequest);
		}
		
	}

}
