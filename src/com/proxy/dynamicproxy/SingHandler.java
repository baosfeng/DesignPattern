package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 *
 * @author Administrator
 * @date 2018/8/20
 */
public class SingHandler implements InvocationHandler {

	private ProxySinger proxySinger;
	private RealSinger singer;

	SingHandler(ProxySinger proxySinger, RealSinger singer) {
		this.proxySinger = proxySinger;
		this.singer = singer;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//返回的对象为二者的公共接口，具体的实现等到接口调用方法实现
		Object object = null;
		switch (method.getName()) {
			case "negotiation":
				object = method.invoke(proxySinger, args);
				break;
			case "signContract":
				object = method.invoke(proxySinger, args);
				break;
			case "sing":
				object = method.invoke(singer, args);
				break;
			case "collectMoney":
				object = method.invoke(proxySinger, args);
				break;
		}
		return object;
	}
}
