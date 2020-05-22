package com.singleton;

/**
 * 饿汉式单例模式加载
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class HungrySingleton {

	private static final HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return instance;
	}
}
