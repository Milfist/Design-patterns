package org.milfist.memento;

public interface Caretaker {
	public void add(Memento state);
	public Memento get(int index);
}
