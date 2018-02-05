package org.milfist.composite;

public class Hoja extends Componente {

	public Hoja (String nombre)
	{
		super(nombre);
	}
	
	@Override
	public void agregar(Componente c) {
		System.out.println("no se puede agregar la hoja");
	}

	@Override
	public void eliminar(Componente c) {
		System.out.println("no se puede quitar la hoja");
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println('-' + "" + nombre);
	}

	
}
