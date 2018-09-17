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

/**
 * 宇宙飞船装配器：获得Builder建造的对象，进行逐个的装配
 *
 * @author Administrator
 * @date 2018/8/19
 */
class SzAirshipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	SzAirshipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}


	@Override
	public AirShip directAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();

		//装配成飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);

		return ship;
	}
}
