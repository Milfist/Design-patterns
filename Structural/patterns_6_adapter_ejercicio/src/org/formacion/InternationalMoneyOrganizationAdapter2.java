package org.formacion;

public class InternationalMoneyOrganizationAdapter2 extends BancoNostrumIml implements InternationalMoneyOrganization {

	@Override
	public void transfer(int cantidad, String cliente) {
		this.movimiento(cliente, cantidad);
	}

	@Override
	public int state(String cliente) {
		
		Integer state = this.estado(cliente);
		
		return state == null ? 0 : state;
	}

}
