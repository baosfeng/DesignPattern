package com.chain;

/**
 * 领导抽象类，各个领导分别处理不同的事情
 *
 * @author Administrator
 * @date 2018/8/23
 */
public abstract class Leader {

	String leaderName;
	private Leader nextLeader;

	Leader(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getLeaderName() {
		return leaderName;
	}

	// 获得下一个领导
	Leader getNextLeader() {
		return nextLeader;
	}

	// 设置下一个领导
	void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	abstract void handleRequest(LeaveRequest request);

}

/**
 * 主管：处理请假天数少于３天的请假
 *
 * @author Administrator
 * @date 2018/8/23
 */
class Director extends Leader {

	Director(String leaderName) {
		super(leaderName);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 3) {
			System.out.println(leaderName + "允许" + request.getEmpName() + "请假" + request.getLeaveDays() + "天，请假理由：" + request.getReason());
		} else if (this.getNextLeader() != null) {
			System.out.println(this.leaderName + "说：你的请假要求，超出我的权限。");
			this.getNextLeader().handleRequest(request);
		}
	}
}

/**
 * 经理：处理请假天数少于１０天的请假
 *
 * @author Administrator
 * @date 2018/8/23
 */
class Manager extends Leader {

	Manager(String leaderName) {
		super(leaderName);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 10) {
			System.out.println(leaderName + "允许" + request.getEmpName() + "请假" + request.getLeaveDays() + "天，请假理由：" + request.getReason());
		} else if (this.getNextLeader() != null) {
			System.out.println(this.leaderName + "说：你的请假要求，超出我的权限。");
			this.getNextLeader().handleRequest(request);
		}
	}
}

/**
 * 总经理：处理请假天数少于30天的请假
 *
 * @author Administrator
 * @date 2018/8/23
 */
class GeneralManager extends Leader {

	GeneralManager(String leaderName) {
		super(leaderName);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println(leaderName + "允许" + request.getEmpName() + "请假" + request.getLeaveDays() + "天，请假理由：" + request.getReason());
		} else if (this.getNextLeader() != null) {
			System.out.println(this.leaderName + "说：你的请假要求，超出我的权限。");
			this.getNextLeader().handleRequest(request);
		}
	}
}

/**
 * 最高的领导，有权处理最高的请求
 *
 * @author Administrator
 * @date 2018/8/23
 */
class Boos extends Leader {

	Boos(String leaderName) {
		super(leaderName);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 40) {
			System.out.println(leaderName + "允许" + request.getEmpName() + "请假" + request.getLeaveDays() + "天，请假理由：" + request.getReason());
		} else {
			System.out.println(this.leaderName + "你是要辞职回家种田吗？");
		}
	}
}