package com.factory.simplefactory;

/**
 * 简单工厂模式:生产一个商品,需要到类中进行专门修改.
 * 简而言之,就是把所有的实例方法统一放置到一个专门的工厂方法中.
 *
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
