package com.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/8/25
 */
public class Client {

	public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		List<Employee> list = new ArrayList<>();
		CommonEmployee employee = new CommonEmployee();
		employee.setName("张三");
		employee.setSex(Employee.MALE);
		employee.setSalary(1000);
		employee.setJob("苦逼的程序员");
		list.add(employee);
		employee = new CommonEmployee();
		employee.setName("李四");
		employee.setSex(Employee.FEMALE);
		employee.setSalary(1100);
		employee.setJob("快乐的美工");
		list.add(employee);
		Manager manager = new Manager();
		manager.setName("王五");
		manager.setSex(Employee.MALE);
		manager.setSalary(2000);
		manager.setPerformance("表现好，升职加薪！");
		list.add(manager);

		for (Employee e : list) {
			e.report();
			e.accept(visitor);
		}
		System.out.println("--------");
		System.out.println(visitor.getTotalSalary());
	}
}
