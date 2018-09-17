package com.adapter;

/**
 * 将被适配的对象，比如说一个对象将被其他对象调用，但第三方对象的接口与本类提供的接口存在冲突，因此需要提供适配器进行适配
 *
 * @author Administrator
 * @date 2018/8/20
 */
class Adaptee {

	void function() {
		System.out.println("我将要被适配了！");
	}
}
