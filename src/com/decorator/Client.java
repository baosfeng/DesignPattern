package com.decorator;

/**
 * 装饰者模式测试类
 *
 * @author Administrator
 * @date 2018/8/22
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		FlyCar flyCar = new FlyCar(car);
		flyCar.run();
		SwimCar swimCar = new SwimCar(flyCar);
		swimCar.run();
	}
}
