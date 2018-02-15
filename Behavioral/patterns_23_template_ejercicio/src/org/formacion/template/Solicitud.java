package org.formacion.template;

public class Solicitud {

	private String nombre;
	private int edat;
	private float peso;
	
	public Solicitud(String nombre, int edat, float peso) {
		this.nombre = nombre;
		this.edat = edat;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdat() {
		return edat;
	}

	public float getPeso() {
		return peso;
	}
	
}
