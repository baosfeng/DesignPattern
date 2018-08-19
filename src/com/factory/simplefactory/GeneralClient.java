package com.factory.simplefactory;

/**
 * 常规方式创建车
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class GeneralClient {

	public static void main(String[] args) {
		Car benz = new Benz();
		benz.start();
		benz.run();
		benz.stop();
		Car bmw = new Bmw();
		bmw.start();
		bmw.run();
		bmw.stop();
	}
}
