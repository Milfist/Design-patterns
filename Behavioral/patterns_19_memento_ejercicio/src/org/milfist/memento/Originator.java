package org.milfist.memento;

public interface Originator {
	public void setState(String state);
	public String getState();
	public Memento saveStateToMemento();
	public void getStateFromMemento(Memento memento);
}
