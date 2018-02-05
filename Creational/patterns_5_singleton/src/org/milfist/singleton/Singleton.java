package org.milfist.singleton;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	private static Singleton INSTANCE; 
	
	private Singleton() {}
	
	public synchronized static Singleton getSingleton() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		} 
		return INSTANCE;
	}

	//Problems With Serialization and Deserialization
	protected Object readResolve() {
        return INSTANCE;
    }
	
}
