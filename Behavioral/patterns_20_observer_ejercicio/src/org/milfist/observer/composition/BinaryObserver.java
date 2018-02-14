package org.milfist.observer.composition;

public class BinaryObserver implements Observer {

	private Subject subject;
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
