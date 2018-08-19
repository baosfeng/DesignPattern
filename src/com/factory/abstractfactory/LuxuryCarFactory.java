package com.factory.abstractfactory;

/**
 * 高端汽车建造工厂
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class LuxuryCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}
}
