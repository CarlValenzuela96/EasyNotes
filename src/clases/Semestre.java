package clases;

import java.util.ArrayList;

public class Semestre {

	private ArrayList<Ramo> litaRamos;

        public Semestre(){
            this.litaRamos = new ArrayList<Ramo>();
        }
        
	public ArrayList<Ramo> getRamo() {
		return this.litaRamos;
	}

	
	public void setRamo(ArrayList<Ramo> ramo) {
		this.litaRamos= ramo;
	}
        
	public void agregarRamo(String nombre) {
		
            Ramo ra = new Ramo(nombre);
	    this.litaRamos.add(ra);
            
	}

	public void eliminarRamo() {
		
		throw new UnsupportedOperationException();
	}

	public void reiniciar() {
		
		throw new UnsupportedOperationException();
	}

}