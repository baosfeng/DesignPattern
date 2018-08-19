package com.factory.abstractfactory;

/**
 * 汽车建造类统一接口，增加单一类型比较困难，如坐骑等
 * 但是增加产品族较为简单，只需要实现CarFactory接口即可
 *
 * @author Administrator
 * @date 2018/8/19
 */
public interface CarFactory {

	Engine createEngine();

	Tyre createTyre();
}