package org.milfist.singleton;

import java.io.Serializable;

public class SingletonLazyInicialization implements Serializable{
	
	private static SingletonLazyInicialization INSTANCE = null; 
	
	private SingletonLazyInicialization() {}
	
	public static SingletonLazyInicialization getSingleton() {
		if (INSTANCE == null) {
			synchronized (SingletonLazyInicialization.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonLazyInicialization();
				}
			}
		} 
		return INSTANCE;
	}
}
