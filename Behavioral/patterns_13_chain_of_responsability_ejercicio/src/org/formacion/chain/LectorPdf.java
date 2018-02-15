package org.formacion.chain;

public class LectorPdf implements LectorDocumentos {


	@Override
	public String contenido(Documento documento) {
		return "pdf " + documento.getContenido();
	}

}
