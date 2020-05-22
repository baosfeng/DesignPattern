package com.facade;

/**
 * 门面模式测试类
 *
 * @author Administrator
 * @date 2018/08/23
 */
public class Client {

	public static void main(String[] args) {
		new RegisterFacade().register();

	}
}
