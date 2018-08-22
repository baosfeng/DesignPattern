package com.decorator;

/**
 * 实现了车的接口，是一俩普通的车
 *
 * @author Administrator
 * @date 2018/8/22
 */
public class Car implements CarInterface {

	@Override
	public void run() {
		System.out.println("我是一俩车，只能在陆地上跑");
	}
}
