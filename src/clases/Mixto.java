package clases;
public class Mixto extends Ramo {

	private boolean separado;
	private float pond_teo;
	private float pond_parct;
	private byte lim_teo;

	public boolean getSeparado() {
		return this.separado;
	}

	
	public void setSeparado(boolean separado) {
		this.separado = separado;
	}

	public float getPond_teo() {
		return this.pond_teo;
	}

	
	public void setPond_teo(float pond_teo) {
		this.pond_teo = pond_teo;
	}

	public float getPond_parct() {
		return this.pond_parct;
	}

	
	public void setPond_parct(float pond_parct) {
		this.pond_parct = pond_parct;
	}

	public byte getLim_teo() {
		return this.lim_teo;
	}

	
	public void setLim_teo(byte lim_teo) {
		this.lim_teo = lim_teo;
	}

	public void agregarPond() {
		
		throw new UnsupportedOperationException();
	}

	public void calcPromedio() {
		
		throw new UnsupportedOperationException();
	}

}