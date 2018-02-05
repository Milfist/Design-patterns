package org.milfist.composite;

import java.util.ArrayList;

public class Compuesto extends Componente{
	
	private ArrayList<Componente> hijo = new ArrayList<Componente>();
	
	public Compuesto (String name)
	{
		super(name);
	}
	
	@Override
	public void agregar(Componente c) {
		this.hijo.add(c);		
	}

	@Override
	public void eliminar(Componente c) {
		this.hijo.remove(c);
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println(nombre + " nivel: " + profundidad);
		for (int i = 0; i < hijo.size(); i++) {
			hijo.get(i).mostrar(profundidad + 1);
		}
	}

}
