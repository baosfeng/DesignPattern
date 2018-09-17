package com.flyweight;

/**
 * 外部状态，即可变状态，设置x与y的坐标轴
 *
 * @author Administrator
 * @date 2018/8/22
 */
public class Coordinate {

	private int x, y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}
}
