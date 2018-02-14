package org.milfist.memento;

import java.util.ArrayList;
import java.util.List;

public class CaretakerImpl implements Caretaker{
	
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	@Override
	public void add(Memento state) {
		mementoList.add(state);
	}

	@Override
	public Memento get(int index) {
		return mementoList.get(index);
	}

}
