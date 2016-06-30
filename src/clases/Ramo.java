package clases;
public class Ramo {

	private String nombre;
	protected byte notas;
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
        
        public byte getNotas() {
		return this.notas;
	}
        
	public void setNotas(byte notas) {
		this.notas = notas;
	}
        
}