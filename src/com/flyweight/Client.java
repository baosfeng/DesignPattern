package com.flyweight;

/**
 * 享元模式:如果都是同种类型的,可以节省大量的内存空间
 * 在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，
 * 如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 * 优点:节省大量的内存
 * 缺点:需要分离出内部不变量和外部可变量,且如果内部不变量少于外部可变量,不建议使用.
 *
 * @author Administrator
 * @date 2018/8/22
 */
public class Client {

	public static void main(String[] args) {
		ChessFlyWeightFactory factory = new ChessFlyWeightFactory();
		FlyWeight black1 = factory.getConcreteChess("black");
		FlyWeight black2 = factory.getConcreteChess("black");
		System.out.println(black1);
		System.out.println(black2);
		FlyWeight white = factory.getConcreteChess("white");
		System.out.println(white);
	}
}
