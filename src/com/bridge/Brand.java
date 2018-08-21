package com.bridge;

/**
 * 品牌的商标接口
 *
 * @author Administrator
 * @date 2018/8/21
 */
public interface Brand {

	void sale();
}

class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.println("联想正在销售");
	}
}

class Dell implements Brand {

	@Override
	public void sale() {
		System.out.println("戴尔正在销售");
	}
}