package com.bridge;

/**
 * 各种种类的电子仪器，具有其他需要组合的抽象接口，本类为抽象类，用于获得实例化后的对象，从而进行组装
 *
 * @author Administrator
 * @date 2018/8/21
 */
abstract class Model {

	private Brand brand;

	Model(Brand brand) {
		this.brand = brand;
	}

	void sale() {
		brand.sale();
	}
}

class Laptop extends Model {

	Laptop(Brand brand) {
		super(brand);
	}

	@Override
	void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
}

class Destop extends Model {

	Destop(Brand brand) {
		super(brand);
	}

	@Override
	void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}