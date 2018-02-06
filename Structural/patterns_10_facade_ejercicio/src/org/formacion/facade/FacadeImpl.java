package org.formacion.facade;

public class FacadeImpl implements Facade{
	
	@Override
	public void registroExpress(String nombre, String mail) {
		
		ServicioConfiguracion configuracion = new ServicioConfiguracion();
		ServicioFidelizacion fidelizacion = new ServicioFidelizacion();
		ServicioComunicacion comunicacion = new ServicioComunicacion();

		fidelizacion.crearTarjeta(nombre, ServicioFidelizacion.Tipo.BASICA);
		configuracion.addEmail(nombre, mail);
		PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
		comunicacion.setPreferencias(nombre, preferencias);
		
	}

}
