package com.builder;

/**
 * 宇宙飞船对象类
 *
 * @author Administrator
 */
public class AirShip {

	private OrbitalModule orbitalModule;  //轨道舱
	private Engine engine; //发动机
	private EscapeTower escapeTower;  //逃逸塔


	void launch() {
		System.out.println("飞船发射！");
	}

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	Engine getEngine() {
		return engine;
	}

	void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}


}

class OrbitalModule {

	private String name;

	OrbitalModule(String name) {
		this.name = name;
	}

	public String getName() {
		return "获得" + name + "轨道舱";
	}

}

class Engine {

	private String name;

	Engine(String name) {
		this.name = name;
	}

	String getName() {
		return "获得" + name + "火箭引擎";
	}


}

class EscapeTower {

	private String name;

	EscapeTower(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return "获得" + name + "逃逸塔";
	}

}


