package com.builder;

/**
 * 装配器统一接口
 */
public interface AirShipDirector {

	/**
	 * 组装飞船对象
	 *
	 * @return AirShip：飞船对象
	 */
	AirShip directAirShip();

}
