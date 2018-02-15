package org.formacion.chain;

public class LectorDoc implements LectorDocumentos {


	@Override
	public String contenido(Documento documento) {
		return "doc " + documento.getContenido();
	}

}
