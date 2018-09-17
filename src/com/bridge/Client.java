package com.bridge;

/**
 * 测试类：桥接模式是依据单一职责模式，然后依靠组合的方式进行拼接，实现了功能的单一化，避免了过多的代码冗余
 * 与装饰者模式有点相同，但不同于装饰者模式的是：装饰者模式中实现的是公用的接口，各个实现子类都具有相同的对象引用，这里引用的对象不同
 * 与建造者模式有点相同，但去别与建造者模式的是：建造者模式是在一个统一的类中进行组装，而不是具体在子类中进行组装
 * 桥梁模式的主要功能是：将抽象和实现进行解耦，使得两者可以独立的进行变化
 *
 * @author Administrator
 * @date 2018/8/21
 */
public class Client {

	public static void main(String[] args) {
		Model laptop = new Laptop(new Lenovo());
		laptop.sale();


		laptop = new Laptop(new Dell());
		laptop.sale();
	}
}
