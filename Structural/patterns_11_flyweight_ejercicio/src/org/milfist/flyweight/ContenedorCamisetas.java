package org.milfist.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ContenedorCamisetas {
	private static Map<String, Camiseta> camisetas = new HashMap<String, Camiseta>();

	public static Camiseta getCamiseta(String numero) {

		String clave = numero;

		System.out.println(clave);

		if (!camisetas.containsKey(clave)) {

			Camiseta c = new CamisetaImpl();
			
			c.crearCamiseta(numero);
			
			camisetas.put(clave, c);
		}
		return camisetas.get(clave);
	}
}
