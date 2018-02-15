package org.formacion.chain;

import java.util.List;

public class ProcesadorDocumentos {

	private LectorDocumentos lectorPdf;
	private LectorDocumentos lectorOdt;
	private LectorDocumentos lectorDoc;

	public ProcesadorDocumentos() {
		this.lectorPdf = new LectorPdf();
		this.lectorOdt = new LectorOdt();
		this.lectorDoc = new LectorDoc();
	}

	public String concatena(List<Documento> documentos) {

		String resultado = "";

		for (Documento doc : documentos) {
			if (doc.getTipo().equals("pdf")) {
				resultado += lectorPdf.contenido(doc);
			} else if (doc.getTipo().equals("odt")) {
				resultado += lectorOdt.contenido(doc);
			} else if (doc.getTipo().equals("doc")) {
				resultado += lectorDoc.contenido(doc);
			} else {
				resultado += "desconocido";
			}

			resultado += "\n";
		}

		return resultado;
	}

}
