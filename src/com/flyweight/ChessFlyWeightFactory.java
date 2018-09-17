package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2018/8/22
 */
class ChessFlyWeightFactory {

	private Map<String, FlyWeight> map = new HashMap<>();

	FlyWeight getConcreteChess(String color) {
		if (map.get(color) != null) {
			return map.get(color);
		}
		ConcreteChess chess = new ConcreteChess();
		chess.setColor(color);
		map.put(color, chess);
		return map.get(color);
	}
}
