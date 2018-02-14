package org.milfist.memento;

public class OriginatorImpl implements Originator {

	private String state;
	
	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	@Override
	public Memento saveStateToMemento() {
		return new MementoImpl(state);
	}

	@Override
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}

}
