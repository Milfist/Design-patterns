package org.formacion.prototype;

import java.util.ArrayList;
import java.util.List;

import org.formacion.prototype.Hamburguesa.Carne;
import org.formacion.prototype.Hamburguesa.Extra;
import org.formacion.prototype.Hamburguesa.Pan;
import org.formacion.prototype.Hamburguesa.Size;

public class HamburguesaFactory {

	private Carne carne;
	private Size size;
	private Pan pan;
	private List<Extra> extras = new ArrayList<>();
	
	public Hamburguesa crea() {
		return new Hamburguesa(carne, size, pan, extras.toArray(new Extra[extras.size()]));
	}
	
	public HamburguesaFactory setCarne(Carne carne) {
		this.carne = carne;
		return this;
	}

	public HamburguesaFactory setSize(Size size) {
		this.size = size;
		return this;
	}

	public HamburguesaFactory setPan(Pan pan) {
		this.pan = pan;
		return this;
	}

	public HamburguesaFactory addExtra(Extra extra) {
		this.extras.add(extra);
		return this;
	}

	public HamburguesaFactory removeExtra(Extra extra) {
		this.extras.remove(extra);
		return this;
	}
	
//	public HamburguesaFactory addExtras(List<Extra> extras) {
//		this.extras = extras;
//		return this;
//	}


	// -- hamburguesas de la carta
//	public static HamburguesaFactory royal() {
//		return new HamburguesaFactory().setCarne(Carne.VACUNO)
//										.setSize(Size.GRANDE)
//										.setPan(Pan.NORMAL)
//										.addExtra(Extra.CEBOLLA)
//										.addExtra(Extra.QUESO);
//	}

	public static Hamburguesa royal() {
		return new Hamburguesa ( Carne.VACUNO, Size.GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.QUESO);
	}
	
	public static Hamburguesa king() {
		return new Hamburguesa ( Carne.VACUNO, Size.EXTRA_GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.HUEVO);
	}

	/**
	 * Prototype
	 * @param original
	 * @return
	 */
	public static HamburguesaFactory from (Hamburguesa original) {
		return new HamburguesaFactory()
				.setCarne(original.getCarne())
				.setSize(original.getSize())
				.setPan(original.getPan())
				.addExtra(original.getExtras().get(0))
				.addExtra(original.getExtras().get(1));
	}

}
