package com.factory.abstractfactory;

/**
 * 抽象工厂测试
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class Client {

	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine engine = factory.createEngine();
		engine.start();

		factory = new LowCarFactory();
		engine = factory.createEngine();
		engine.start();
	}
}
