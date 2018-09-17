package com.mediator;

/**
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
