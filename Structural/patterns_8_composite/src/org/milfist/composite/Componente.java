package org.milfist.composite;

public abstract class Componente {
	protected String nombre;
	public Componente (String nombre)
	{
		this.nombre = nombre;
	}
	abstract public void agregar(Componente c);
	abstract public void eliminar(Componente c);
	abstract public void mostrar(int profundidad);

}
