package org.formacion;

public class InternationalMoneyOrganizationAdapter implements InternationalMoneyOrganization {

	private BancoNostrum bancoNostrum;
	
	public InternationalMoneyOrganizationAdapter(BancoNostrum bancoNostrum) {
		this.bancoNostrum = bancoNostrum;
	}

	@Override
	public void transfer(int cantidad, String cliente) {
		this.bancoNostrum.movimiento(cliente, cantidad);
	}

	@Override
	public int state(String cliente) {
		return this.bancoNostrum.estado(cliente);
	}

}
