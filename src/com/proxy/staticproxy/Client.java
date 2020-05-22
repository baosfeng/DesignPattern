package com.proxy.staticproxy;

/**
 * 静态代理类测试类
 * 与中介者模式不同的是,静态代理是全权交给代理者去做
 * 中介者模式是需要的时候才需要调用,找中介者负责,然后由中介者找到对应的人员进行负责处理
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
