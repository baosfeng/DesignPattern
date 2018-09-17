package com.visitor;

/**
 * @author Administrator
 * @date 2018/8/25
 */
public class Manager extends Employee {

	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
