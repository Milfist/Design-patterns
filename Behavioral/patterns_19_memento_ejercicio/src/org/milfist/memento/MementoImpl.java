package org.milfist.memento;

public class MementoImpl implements Memento {

	private String state;
	
	public MementoImpl(String state) {
		this.state = state;
	}

	@Override
	public String getState() {
		return state;
	}

	
	
}
