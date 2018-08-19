package com.singleton;

/**
 * 懒汉式实现单例模式
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			return instance = new LazySingleton();
		}
		return instance;
	}
}
