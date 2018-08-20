package com.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 *
 * @author Administrator
 * @date 2018/8/20
 */
public class Client {

	public static void main(String[] args) {
		RealSinger singer = new RealSinger();
		ProxySinger proxySinger = new ProxySinger();
		SingHandler handler = new SingHandler(proxySinger, singer);
		//获得二者的公共接口，进行调用
		SingInterface proxy = (SingInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{SingInterface.class}, handler);
		proxy.negotiation();
		proxy.signContract();
		proxy.sing();
		proxy.collectMoney();
	}
}
