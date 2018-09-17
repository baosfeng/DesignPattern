package com.observer;

/**
 * @author Administrator
 * @date 2018/8/23
 */
public interface IObserver {

	void update(Subject subject);
}

class ObserverA implements IObserver {

	private int myState;

	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject) subject).getState();
	}

	int getMyState() {
		return myState;
	}
}

class ObserverB implements IObserver {

	private int myState;

	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject) subject).getState();
	}

	int getMyState() {
		return myState;
	}
}