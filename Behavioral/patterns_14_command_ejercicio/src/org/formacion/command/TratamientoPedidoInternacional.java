package org.formacion.command;

public class TratamientoPedidoInternacional implements TratamientoPedido {

	private PedidoInternacional pedido;

	public TratamientoPedidoInternacional(PedidoInternacional pedido) {
		this.pedido = pedido;
	}


	public boolean tratar() {
		
		boolean ok = true;
		
		if (pedido.getDestino().equals("Mordor")) {
			ok = false;
		}
		
		return ok; 
	}
}
