package com.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者：其他类需要通过中介者才能跟其他类进行沟通，减少了耦合度，同时提高了系统的可维护性
 * 每个中介者持有其他的所有对象，其他对象也有中介者对象
 *
 * @author Administrator
 * @date 2018/8/23
 */
public interface Mediator {

	// 注册
	void register(String dName, Department department);

	// 发布需求
	void command(String dName);
}

class President implements Mediator {

	private Map<String, Department> map = new HashMap<>();

	@Override
	public void register(String dName, Department department) {
		map.put(dName, department);
	}

	@Override
	public void command(String dName) {
		map.get(dName).outAction();
	}
}
