package com.factory.abstractfactory;

/**
 * 抽象工厂测试
 * 抽象工厂相比较普通工厂,增加的内容有:
 * 1.抽象工厂支持生产更多的同种类别商品
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
