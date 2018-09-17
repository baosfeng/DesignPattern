package com.template;

/**
 * 将公用的方法进行抽取，其他的需要实现的方法由子类自行实现
 *
 * @author Administrator
 * @date 2018年9月17日 23:27:51
 */
abstract class BankTemplateMethod {

	//具体方法
	private void takeNumber() {
		System.out.println("取号排队");
	}

	abstract void transact(); //办理具体的业务	//钩子方法

	private void evaluate() {
		System.out.println("反馈评分");
	}


	final void process() {    //模板方法！！！
		this.takeNumber();

		this.transact();

		this.evaluate();
	}

}
