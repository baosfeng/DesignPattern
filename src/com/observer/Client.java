package com.observer;

/**
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
