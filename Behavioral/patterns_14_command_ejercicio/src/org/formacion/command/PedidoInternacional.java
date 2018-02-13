package org.formacion.command;

public class PedidoInternacional implements Pedido {

	private String destino;
	private int peso;
	
	public PedidoInternacional(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;
	}

	public int peso() {
		return peso;
	}

	public String getDestino() {
		return destino;
	}

}
