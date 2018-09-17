package com.mediator;

/**
 * @author Administrator
 * @date 2018/8/23
 */
public class Finical implements Department {

	//对中介者进行注册
	private Mediator mediator;

	Finical(Mediator mediator) {
		this.mediator = mediator;
		mediator.register("finical", this);
	}

	@Override
	public void selfAction() {
		System.out.println("负责财务相关的事情");
	}

	@Override
	public void outAction() {
		System.out.println("钱太多了，不知道怎么花");
	}
}
