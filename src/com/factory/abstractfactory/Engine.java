package com.factory.abstractfactory;

/**
 * 定义Engine接口，下属LuxuryEngine、LowEngine
 *
 * @author Administrator
 * @date 2018/8/19
 */
public interface Engine {

	void start();
}

class LuxuryEngine implements Engine {

	@Override
	public void start() {
		System.out.println("高端奢侈引擎启动了。。。");
	}
}

class LowEngine implements Engine {

	@Override
	public void start() {
		System.out.println("低端垃圾引擎启动了。。。");
	}
}