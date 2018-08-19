package com.builder;

/**
 * 宇宙飞船装配器：获得Builder建造的对象，进行逐个的装配
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class SzAirshipDirector implements AirShipDirector {

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
