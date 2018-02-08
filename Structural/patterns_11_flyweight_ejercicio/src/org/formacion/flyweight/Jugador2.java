package org.formacion.flyweight;

public class Jugador2 {

	public Camiseta c = new Camiseta();
	
 	public String dibuja() {
 		return c.dibuja("2".toCharArray()[0]);
 	}

}
