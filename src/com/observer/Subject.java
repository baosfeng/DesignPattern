package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/8/23
 */
public abstract class Subject {

	protected int state;
	protected List<IObserver> list = new ArrayList<>();

	void notifyAllObservers() {
		for (IObserver observer : list) {
			observer.update(this);
		}
	}

	void register(IObserver observer) {
		list.add(observer);
	}

	void remove(IObserver observer) {
		list.remove(observer);
	}
}

class ConcreteSubject extends Subject {

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}
}

