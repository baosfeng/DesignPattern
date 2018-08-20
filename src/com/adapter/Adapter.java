package com.adapter;

/**
 * 第三方类实现类
 *
 * @author Administrator
 * @date 2018/8/20
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handleRequest() {
		//通过此Target接口实现类调用待转换的类方法，从而实现不必修改即可实现类的转变
		adaptee.function();
	}
}
