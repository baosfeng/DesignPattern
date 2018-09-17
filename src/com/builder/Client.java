package com.builder;

/**
 * 测试飞船，具体的流程为：
 *      1.获得建造者，用于装配对象
 *      2.获得需要的建造者，从而开始实现装配，具体的装配在导演中进行完成
 *      3.获得产生后的对象
 */
public class Client {

	public static void main(String[] args) {

		AirShipDirector director = new SzAirshipDirector(new SzAirShipBuilder());

		AirShip ship = director.directAirShip();

		System.out.println(ship.getEngine().getName());
		System.out.println(ship.getEscapeTower().getName());
		System.out.println(ship.getOrbitalModule().getName());

		ship.launch();

	}
}
