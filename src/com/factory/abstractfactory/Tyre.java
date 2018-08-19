package com.factory.abstractfactory;

/**
 * 轮胎公用接口，下属LuxuryTyre、LowTyre
 *
 * @author Administrator
 * @date 2018/8/19
 */
public interface Tyre {

	void rotate();
}

class LuxuryTyre implements Tyre {

	@Override
	public void rotate() {
		System.out.println("高端轮胎在旋转");
	}
}

class LowTyre implements Tyre {

	@Override
	public void rotate() {
		System.out.println("低端轮胎在旋转");
	}
}