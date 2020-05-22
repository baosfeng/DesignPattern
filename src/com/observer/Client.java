package com.observer;

/**
 * 观察者模式:用于当被观察者发生变化的时候,通知观察者
 *
 * @author Administrator
 * @date 2018/8/23
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		IObserver observerA = new ObserverA();
		IObserver observerB = new ObserverB();
		subject.register(observerA);
		subject.register(observerB);
		subject.setState(100);
		System.out.println(((ObserverA) observerA).getMyState());
		System.out.println(((ObserverB) observerB).getMyState());
	}
}
