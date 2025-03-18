package _4_generics;

public class Caja <T>{

	private T contenido;

	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	}

	public Caja(T contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Caja [contenido=" + contenido + "]";
	}

	public static void main(String[] args) {
		
		Caja<String> c1 = new Caja<String>("a");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
