package _a12_collectionsEnum;

import java.util.Random;

public enum Marca {
	
	WV("Volskswagen"), CT("Citroen"), ST("Seat"),
	ME("Mercedes"), RN("Renault");
	
	private String nombre;
	private static Random random = new Random();
	
	public String getNombre() {
		return nombre;
	}
	private Marca(String nombre) {
		this.nombre = nombre;
	}
	public static Marca aleatorio() {
		return Marca.values() [random.nextInt(Marca.values().length)];
	}
	
}
