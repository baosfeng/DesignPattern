package com.memento;

import java.util.LinkedList;

/**
 * 使用集合进行保存多个备忘录
 *
 * @author Administrator
 * @date 2018/8/23
 */
class CareTaker {

	//保存多个备忘录信息
	private static final LinkedList<EmpMemento> list = new LinkedList<>();

	static EmpMemento getEmpMemento() {
		return list.getLast();
	}

	static void setEmpMemento(EmpMemento empMemento) {
		list.add(empMemento);
	}

	/**
	 * 根据索引获得备忘录信息
	 *
	 * @param index 索引值
	 * @return 备忘录
	 */
	static EmpMemento getEmpMemento(int index) {
		return list.get(index);
	}
}
