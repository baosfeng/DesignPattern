package com.memento;

/**
 * 备忘录模式,用于记录输入的历史记录
 *
 * @author Administrator
 * @date 2018/8/23
 */
public class Client {

	public static void main(String[] args) {
		Emp emp = new Emp("张三", 10, 1000.99);
		EmpMemento memento = emp.memento();
		CareTaker.setEmpMemento(memento);
		System.out.println(emp);
		emp.seteName("李四");
		emp.setAge(11);
		emp.setSalary(1999.99);
		System.out.println(emp);
		emp.recovery(CareTaker.getEmpMemento());
		System.out.println(emp);
	}
}
