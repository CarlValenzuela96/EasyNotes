package clases;
public class Mixto extends Ramo {

	private boolean separado;
        private byte cantNP;
        private byte cantNT;
	private double pond_teo;
	private double pond_parct;
	private byte lim_teo;

    

    public byte getCantNP() {
        return cantNP;
    }

    public void setCantNP(byte cantNP) {
        this.cantNP = cantNP;
    }

    public byte getCantNT() {
        return cantNT;
    }

    public void setCantNT(byte cantNT) {
        this.cantNT = cantNT;
    }
    

	public boolean getSeparado() {
		return this.separado;
	}

	
	public void setSeparado(boolean separado) {
		this.separado = separado;
	}

	public double getPond_teo() {
		return this.pond_teo;
	}

	
	public void setPond_teo(double pond_teo) {
		this.pond_teo = pond_teo;
	}

	public double getPond_parct() {
		return this.pond_parct;
	}

	
	public void setPond_parct(double pond_parct) {
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