package com.memento;

/**
 * 保存备忘录的类，基本上与备忘录保持一致，只有这样才能记录备忘录信息
 *
 * @author Administrator
 * @date 2018/8/23
 */
class EmpMemento {

	private String eName;
	private int age;
	private double salary;

	EmpMemento(Emp emp) {
		this.eName = emp.geteName();
		this.age = emp.getAge();
		this.salary = emp.getSalary();
	}

	String geteName() {
		return eName;
	}

	int getAge() {
		return age;
	}

	double getSalary() {
		return salary;
	}
}
