package org.milfist.observer.inheritance;

public class HexaObserver extends ObserverImpl{

	   public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
	}
