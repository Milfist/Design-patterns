package org.formacion.decorator;

import java.util.List;

public class LoggerAdapter implements BaseDatos {

	private BaseDatos bd;
	private Logger logger;
	
	public LoggerAdapter(BaseDatos bd, Logger logger) {
		this.bd = bd;
		this.logger = logger;
	}

	@Override
	public void inserta(String registro) {
		this.logger.add("inserta " + registro);
		this.bd.inserta(registro);
	}

	@Override
	public List<String> registros() {
		this.logger.add("lectura");
		return this.bd.registros();
	}

	

}
