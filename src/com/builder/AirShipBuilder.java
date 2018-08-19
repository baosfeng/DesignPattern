package com.builder;

/**
 * 建造器统一接口
 */
public interface AirShipBuilder {

	Engine builderEngine();

	OrbitalModule builderOrbitalModule();

	EscapeTower builderEscapeTower();
}
