package org.formacion.flyweight;

public class Jugador3 {

	public Camiseta c = new Camiseta();
	
 	public String dibuja() {
 		return c.dibuja("3".toCharArray()[0]);
 	}

}
