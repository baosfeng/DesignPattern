package com.chain;

/**
 * 请假申请
 *
 * @author Administrator
 * @date 2018/8/23
 */
class LeaveRequest {

	private String empName;
	private int leaveDays;
	private String reason;

	LeaveRequest(String empName, int leaveDays, String reason) {
		this.empName = empName;
		this.leaveDays = leaveDays;
		this.reason = reason;
	}

	String getEmpName() {
		return empName;
	}

	int getLeaveDays() {
		return leaveDays;
	}

	String getReason() {
		return reason;
	}

}
