package com.singleton;

/**
 * 静态内部类实现单例模式
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class StaticInnerSingleton {

	private StaticInnerSingleton() {
	}

	public static StaticInnerSingleton getInstance() {
		return CreateInstance.instance;
	}

	private static class CreateInstance {

		private static final StaticInnerSingleton instance = new StaticInnerSingleton();
	}
}
