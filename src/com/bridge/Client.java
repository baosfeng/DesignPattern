package com.bridge;

/**
 * 测试类：桥接模式是依据单一职责模式，然后依靠组合的方式进行拼接，实现了功能的单一化，避免了过多的代码冗余
 *
 * @author Administrator
 * @date 2018/8/21
 */
public class Client {

	public static void main(String[] args) {
		Model laptop = new Laptop(new Lenovo());
		laptop.sale();
	}
}
