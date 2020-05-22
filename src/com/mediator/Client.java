package com.mediator;

/**
 * 与门面模式不同的是,门面模式对外暴露的是需要对外进行暴露的.
 * 中介者模式是作为连接两个其他不同出现的
 *
 * @author Administrator
 * @date 2018/8/23
 */
public class Client {

	public static void main(String[] args) {
		Mediator mediator = new President();
		Department finical = new Finical(mediator);
		Department market = new Market(mediator);
		market.selfAction();
		market.outAction();

		finical.selfAction();
		finical.outAction();
	}
}
