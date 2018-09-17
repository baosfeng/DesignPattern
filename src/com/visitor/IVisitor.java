package com.visitor;

/**
 * 访问者模式的接口
 *
 * @author Administrator
 * @date 2018/8/25
 */
public interface IVisitor {

	void visit(CommonEmployee employee);

	void visit(Manager manager);

	int getTotalSalary();
}

class Visitor implements IVisitor {

	private final static int MANAGER_COEFFICIENT = 5;
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

	private int commonEmployeeTotalSalary = 0;
	private int managerTotalSalary = 0;

	@Override
	public void visit(CommonEmployee employee) {
		String info = employee.getJob();
		commonEmployeeTotalSalary = commonEmployeeTotalSalary + employee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
		System.out.println("\t" + info);
	}

	@Override
	public void visit(Manager manager) {
		String info = manager.getPerformance();
		managerTotalSalary = managerTotalSalary + manager.getSalary() * MANAGER_COEFFICIENT;
		System.out.println("\t" + info);
	}

	@Override
	public int getTotalSalary() {
		return commonEmployeeTotalSalary + managerTotalSalary;
	}
}