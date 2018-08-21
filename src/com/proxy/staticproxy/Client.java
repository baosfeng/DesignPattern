package com.proxy.staticproxy;

/**
 * 静态代理类测试类
 *
 * @author Administrator
 * @date 2018/8/20
 */
public class Client {

	public static void main(String[] args) {
		RealSinger singer = new RealSinger();
		SingInterface proxy = new ProxySinger(singer);
		proxy.negotiation();
		proxy.signContract();
		proxy.sing();
		proxy.collectMoney();
	}
}
