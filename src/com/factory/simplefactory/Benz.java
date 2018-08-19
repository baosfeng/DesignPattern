package com.factory.simplefactory;

/**
 * @author Administrator
 * @date 2018/8/19
 */
public class Benz implements Car {

	@Override
	public void start() {
		System.out.println("奔驰车启动");
	}

	@Override
	public void run() {
		System.out.println("奔驰车正在跑");
	}

	@Override
	public void stop() {
		System.out.println("奔驰车熄火");
	}
}
