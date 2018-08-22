package com.decorator;

/**
 * 实现了车的公共接口，用于装饰类，但是把类定义为抽象类，本类不做其他的实现
 *
 * @author Administrator
 * @date 2018/8/22
 */
public abstract class DecoratorCar implements CarInterface {

	protected CarInterface car;

	public DecoratorCar(CarInterface car) {
		this.car = car;
	}

	@Override
	public void run() {
		car.run();
	}
}
