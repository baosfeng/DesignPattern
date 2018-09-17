package com.memento;

/**
 * @author Administrator
 * @date 2018/8/23
 */
public class Emp {

	private String eName;
	private int age;
	private double salary;

	Emp(String eName, int age, double salary) {
		this.eName = eName;
		this.age = age;
		this.salary = salary;
	}

	public Emp() {
	}

	String geteName() {
		return eName;
	}

	void seteName(String eName) {
		this.eName = eName;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	void recovery(EmpMemento empMemento) {
		this.eName = empMemento.geteName();
		this.age = empMemento.getAge();
		this.salary = empMemento.getSalary();
	}

	EmpMemento memento() {
		return new EmpMemento(this);
	}

	@Override
	public String toString() {
		return "Emp{" +
				"eName='" + eName + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}
}
