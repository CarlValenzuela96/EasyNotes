package clases;
public class Ramo {

	private String nombre;
	protected float[][] notas;
	private Archivo archivo;

        public Ramo(){
            
        }
        
        public Ramo(String nombre){
            this.nombre=nombre;
        }
        
	public String getNombre() {
		return this.nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected float[] ponderar() {
		
		throw new UnsupportedOperationException();
	}

	public void agregarNotas() {
		
		throw new UnsupportedOperationException();
	}

}