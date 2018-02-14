package org.milfist.memento;

public class Demo {

	public static void main(String[] args) {
		
		Originator originator = new OriginatorImpl();
		Caretaker caretaker = new CaretakerImpl();

		originator.setState("State #1");
		originator.setState("State #2");
		caretaker.add(originator.saveStateToMemento());

		originator.setState("State #3");
		caretaker.add(originator.saveStateToMemento());

		originator.setState("State #4");
		System.out.println("Current State: " + originator.getState());

		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(caretaker.get(1));
		System.out.println("Second saved State: " + originator.getState());

	}

}
