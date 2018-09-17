package com.visitor;

/**
 * @author Administrator
 * @date 2018/8/25
 */
public class CommonEmployee extends Employee {

	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
