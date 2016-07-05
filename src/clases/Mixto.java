package clases;
public class Mixto extends Ramo {

        private byte cantNP;
        private byte cantNT;
	private double pond_teo;
	private double pond_parct;

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
        
        //calcula el promedio total del ramo usando el promedio teorico, promedio practico ,ponderacion practica y ponderacion teorica
        // y retorna un double con el promedio general del ramo
        public double calcPromedioTotal(double promT, double promP, double pondT, double pondP) {
            
            double promFT = promT*(pondT/100);
            double promFP = promP*(pondP/100);
            double promFinal = promFT+promFP;
            
            return promFinal;
	}

}