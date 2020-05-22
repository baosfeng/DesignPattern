package com.factory.factorymethod;

/**
 * 工厂模式测试类
 * 普通工厂方法,专门使用一个接口对外进行公开制造方法的函数,但是不具体实现.
 * 具体的实现交给普通的子类工厂实现.
 * 优点:符合单一职责模式
 * 缺点:如果制造的子类很多,将会导致大量的冗余
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
