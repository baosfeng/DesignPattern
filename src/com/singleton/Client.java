package com.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试各个单例实现类是否能实现单例
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class Client {

	@Test
	public void testHungry() {
		HungrySingleton singleton1 = HungrySingleton.getInstance();
		HungrySingleton singleton2 = HungrySingleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}

	@Test
	public void testLazy() {
		LazySingleton singleton1 = LazySingleton.getInstance();
		LazySingleton singleton2 = LazySingleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}

	@Test
	public void testDouble() {
		DoubleCheckSingleton singleton1 = DoubleCheckSingleton.getInstance();
		DoubleCheckSingleton singleton2 = DoubleCheckSingleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}

	@Test
	public void testStatic() {
		StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
		StaticInnerSingleton singleton2 = StaticInnerSingleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}

	@Test
	public void testEnum() {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton1 == singleton2);
	}

	@Test
	public void testReflect() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		ProtectSingletonFromReflectAndSerializable testInstance = ProtectSingletonFromReflectAndSerializable.getInstance();
		Class<ProtectSingletonFromReflectAndSerializable> clazz = (Class<ProtectSingletonFromReflectAndSerializable>) Class.forName(
				"com.singleton.ProtectSingletonFromReflectAndSerializable");
		Constructor<ProtectSingletonFromReflectAndSerializable> declaredConstructor = clazz.getDeclaredConstructor(null);
		declaredConstructor.setAccessible(true);
		ProtectSingletonFromReflectAndSerializable instance = declaredConstructor.newInstance(null);
		System.out.println(testInstance);
		System.out.println(instance);
	}
}
