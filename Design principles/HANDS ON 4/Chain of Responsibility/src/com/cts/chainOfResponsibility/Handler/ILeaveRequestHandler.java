package com.cts.chainOfResponsibility.Handler;

import com.cts.chainOfResponsibility.Model.LeaveRequest;

public interface ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	
	public void HandleRequest(LeaveRequest leaveRequest);
	
}
