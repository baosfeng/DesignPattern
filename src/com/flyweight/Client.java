package com.flyweight;

/**
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
