package org.formacion.proxy;

public class CuentaRigida implements Cuenta{

	private final String cliente;
	private int cantidad;
	private CuentaNormal cuentaNormal;
	
	
	public CuentaRigida(String cliente) {
		this.cliente = cliente;
		this.cantidad = 0;
		cuentaNormal = new CuentaNormal(cliente);
	}

	@Override
	public String getCliente() {
		return cliente;
	}

	@Override
	public int getCantidad() {
		return cantidad;
	}

	@Override
	public void movimiento(int importe) {
		if (cantidad + importe > 0) {
			cuentaNormal.movimiento(importe);
			cantidad = cuentaNormal.getCantidad();
		}
		
	}

}
