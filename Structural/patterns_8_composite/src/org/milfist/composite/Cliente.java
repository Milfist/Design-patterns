package org.milfist.composite;

public class Cliente {

	public static void main(String[] args) {
		Compuesto raiz = new Compuesto("root");
		raiz.agregar(new Hoja("hoja A"));
		raiz.agregar(new Hoja("hoja B"));
		Compuesto comp = new Compuesto("compuesto X");
		comp.agregar(new Hoja("hoja XA"));
		comp.agregar(new Hoja("hoja XB"));
		raiz.agregar(comp);
		raiz.agregar(new Hoja("hoja C"));
		Hoja l = new Hoja("hoja D");
		raiz.agregar(l);
		raiz.eliminar(l);
		raiz.mostrar(1);
	}

}
