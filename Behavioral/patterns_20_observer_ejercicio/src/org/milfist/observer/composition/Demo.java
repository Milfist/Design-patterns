package org.milfist.observer.composition;

public class Demo {

	public static void main(String[] args) {
		Subject subject = new SubjectImpl();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);

	}

}
