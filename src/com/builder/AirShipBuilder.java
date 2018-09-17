package com.builder;

/**
 * 建造器统一接口，具有所有能够构建飞船的构件
 */
public interface AirShipBuilder {

	Engine builderEngine();

	OrbitalModule builderOrbitalModule();

	EscapeTower builderEscapeTower();

}

/**
 * Builder建造器接口实现类
 */
class SzAirShipBuilder implements AirShipBuilder {

	//StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	@Override
	public Engine builderEngine() {
		System.out.println("构建神舟牌发动机！");
		return new Engine("神舟牌发动机！");
	}

	@Override
	public EscapeTower builderEscapeTower() {

		System.out.println("构建逃逸塔");
		return new EscapeTower("神舟牌逃逸塔");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("神舟牌轨道舱");
	}

}