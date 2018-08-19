package com.factory.simplefactory;

/**
 * 第一种方法创建简单工厂，简单工厂不符合开闭原则，如果需要添加产品，需要修改源码
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class CarFactory {

	public static Car createBenz() {
		return new Benz();
	}

	public static Car createBmw() {
		return new Bmw();
	}
}

/**
 * 第二种方法创建简单工厂
 */
class CarCreateFactory {

	public static Car createCar(String carName) {
		if (carName.trim().equalsIgnoreCase("benz")) {
			return new Benz();
		} else if (carName.trim().equalsIgnoreCase("bmw")) {
			return new Bmw();
		} else {
			return null;
		}
	}
}
