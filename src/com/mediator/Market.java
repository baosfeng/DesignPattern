package com.mediator;

/**
 * @author Administrator
 * @date 2018/8/23
 */
public class Market implements Department {

	private Mediator mediator;

	Market(Mediator mediator) {
		this.mediator = mediator;
		mediator.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("出去跑业务");
	}

	@Override
	public void outAction() {
		System.out.println("钱不够花了，请求财务部进行支援");
		mediator.command("finical");
	}
}
