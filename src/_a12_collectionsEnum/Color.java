package _a12_collectionsEnum;

import java.util.Random;

public enum Color {

	RO("rojo"), NA("naranja"), AM("amarillo"),
	VE("verde"), AZ("azul"), IN("índigo"), VI("violeta");
	
	private String color;
	private static Random random = new Random();
	
	public String getNombre() {
		return color;
	}
	private Color(String nombre) {
		this.color = nombre;
	}
	
	public static Color aleatorio() {
		return Color.values() [random.nextInt(Color.values().length)];
	}
	
	
	
	
}
