package com.factory.abstractfactory;

/**
 * 低端汽车建造工厂
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class LowCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}
}
