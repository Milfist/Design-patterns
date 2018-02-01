package org.formacion.builder;

public class Persona {

	private String nombre;
	private int edad;
	private String municipio;
	private String colegio;
	private String lugarTrabajo;
	
	private Persona() {}
	
	
	public static class Builder {
		private Persona persona;
		
		public Builder(String nombre) {
			persona = new Persona();
			persona.nombre = nombre;
		}
		
		public Builder setMunicipio (String municipio) {
			persona.municipio = municipio;
			return this;
		}
		
		public Builder setMayor(int edad, String lugarTrabajo) {
			if (edad < 18) throw new IllegalArgumentException("es menor de edad " + edad);
			persona.edad = edad;
			persona.lugarTrabajo = lugarTrabajo;
			persona.colegio = null;
			return this;
		}
		
		public Builder setMenor(int edad, String colegio) {
			if (edad >= 18) throw new IllegalArgumentException("es mayor de edad " + edad);
			persona.edad = edad;
			persona.colegio = colegio;
			persona.lugarTrabajo = null;
			return this;
		}
	
		public Persona build() {
			return persona;
		}

	}
	
}
