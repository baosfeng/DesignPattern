package com.adapter;

/**
 * 第三方类通过使用中间接口，从而实现了对Adaptee类方法的调用
 *
 * @author Administrator
 * @date 2018/8/20
 */
public class Client {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.handleRequest();
	}
}
