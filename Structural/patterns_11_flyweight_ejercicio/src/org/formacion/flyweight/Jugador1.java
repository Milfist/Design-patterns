package org.formacion.flyweight;

public class Jugador1 {

	public Camiseta c = new Camiseta();
	
 	public String dibuja() {
 		return c.dibuja("1".toCharArray()[0]);
 	}

}
