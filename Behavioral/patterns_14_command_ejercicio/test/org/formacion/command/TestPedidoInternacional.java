package org.formacion.command;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPedidoInternacional {

	@Test
	public void test() {
		
		
		// Cread una clase TratamientoPedidoInternacional que permita tratar pedidos internacionales
		// La clase debe permitir tratar todos los pedidos excepto los que van a Mordor
		
		// Descomentad el codigo y ejecutad el test
		
		
		TratamientoPedido tratamientoKO = new TratamientoPedidoInternacional(new PedidoInternacional("Mordor", 100));
		assertFalse(tratamientoKO.tratar());
		
		TratamientoPedido tratamientoOK = new TratamientoPedidoInternacional(new PedidoInternacional("Comarca", 100));
		assertTrue(tratamientoOK.tratar());
	
		
	}

}
