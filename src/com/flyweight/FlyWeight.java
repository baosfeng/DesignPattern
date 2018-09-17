package com.flyweight;

/**
 * 享元模式
 *
 * @author Administrator
 * @date 2018/8/22
 */
public interface FlyWeight {

	String getColor();

	void setColor(String c);

	void display(Coordinate c);
}

class ConcreteChess implements FlyWeight {

	private String color;

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子的颜色：" + color);
		System.out.println("棋子的位置：" + c.getX() + "---" + c.getY());
	}
}