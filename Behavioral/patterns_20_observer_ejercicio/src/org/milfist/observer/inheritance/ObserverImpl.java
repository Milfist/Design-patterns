package org.milfist.observer.inheritance;

public abstract class ObserverImpl implements Observer {
	protected Subject subject;
	public abstract void update();
}
