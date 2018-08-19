package com.factory.factorymethod;

/**
 * 工厂模式测试类
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class Client {

	public static void main(String[] args) {
		Car benz = new BenzCarFactory().builderCar();
		benz.start();
		benz.run();
		benz.stop();
		Car bmw = new BmwCarFactory().builderCar();
		bmw.start();
		bmw.run();
		bmw.stop();
	}
}
