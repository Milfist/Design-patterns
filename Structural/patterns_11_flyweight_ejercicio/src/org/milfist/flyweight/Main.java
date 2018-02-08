package org.milfist.flyweight;

public class Main {

	public static void main(String[] args) {
		
		Jugador j1 = new JugadorImpl("1");
		Jugador j2 = new JugadorImpl("2");
		Jugador j3 = new JugadorImpl("3");
		Jugador j12 = new JugadorImpl("1");
		System.out.println("\n\n------ jugador 1 -----\n\n");
		System.out.println(j1.dibuja());
		System.out.println("\n\n------ jugador 2 -----\n\n");
		System.out.println(j2.dibuja());
		System.out.println("\n\n------ jugador 3 -----\n\n");
		System.out.println(j3.dibuja());
		System.out.println("\n\n------ jugador 4 -----\n\n");
		System.out.println(j12.dibuja());
	}

}
