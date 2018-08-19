package com.singleton;

/**
 * 枚举类实现单例模式加载，由于枚举本身的特性，因此可防止反射、反序列化漏洞进行重复生成类
 *
 * @author Administrator
 * @date 2018/8/19
 */
public enum EnumSingleton {
	INSTANCE;
}
