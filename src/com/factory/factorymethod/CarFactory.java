package com.factory.factorymethod;

/**
 * 符合开闭原则，但是增加了很多不必要的消耗
 *
 * @author Administrator
 * @date 2018/8/19
 */
public interface CarFactory {

	Car builderCar();
}
