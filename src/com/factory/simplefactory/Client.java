package com.factory.simplefactory;

/**
 * @author Administrator
 * @date 2018/8/19
 */
public class Client {

	public static void main(String[] args) {
		Car benz = CarFactory.createBenz();
		benz.start();
		benz.run();
		benz.stop();
		Car bmw = CarFactory.createBmw();
		bmw.start();
		bmw.run();
		bmw.stop();
	}
}
