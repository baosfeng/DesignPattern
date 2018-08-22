package com.decorator;

/**
 * 游泳车
 *
 * @author Administrator
 * @date 2018/8/22
 */
public class SwimCar extends DecoratorCar {

	public SwimCar(CarInterface car) {
		super(car);
	}

	@Override
	public void run() {
		super.run();
	}

	void swim() {
		System.out.println("我是一俩能游泳的车");
	}
}
