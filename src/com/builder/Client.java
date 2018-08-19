package com.builder;

/**
 * 测试飞船
 */
public class Client {

	public static void main(String[] args) {

		AirShipDirector director = new SzAirshipDirector(new SzAirShipBuilder());

		AirShip ship = director.directAirShip();

		System.out.println(ship.getEngine().getName());

		ship.launch();

	}
}
