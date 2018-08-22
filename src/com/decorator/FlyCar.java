package com.decorator;

/**
 * 飞行车
 *
 * @author Administrator
 * @date 2018/8/22
 */
public class FlyCar extends DecoratorCar {

	public FlyCar(CarInterface car) {
		super(car);
	}

	@Override
	public void run() {
		super.run();
		fly();
	}

	public void fly() {
		System.out.println("我是一俩能飞的车");
	}
}
