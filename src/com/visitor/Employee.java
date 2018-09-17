package com.visitor;

/**
 * @author Administrator
 * @date 2018/8/25
 */
public abstract class Employee {

	protected final static int MALE = 0;
	protected final static int FEMALE = 1;
	protected int salary;
	protected String name;
	protected int sex;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	void report() {
		String info = "姓名" + this.getName() + "\t";
		info = info + "性别" + (this.sex == MALE ? "男" : "女") + "\t";
		info = info + "薪水" + this.salary + "\t";
		System.out.print(info);
	}

	abstract void accept(IVisitor visitor);
}
