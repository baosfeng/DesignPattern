package com.singleton;

/**
 * 双重检测实现单例模式
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {
	}

	/**
	 * 双重判断用于提高加载速度，但限于jvm底层，此方法实现可能会报错
	 *
	 * @return
	 */
	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			DoubleCheckSingleton singleton;
			synchronized (DoubleCheckSingleton.class) {
				singleton = instance;
				if (singleton == null) {
					singleton = new DoubleCheckSingleton();
				}
			}
			instance = singleton;
		}
		return instance;
	}
}
