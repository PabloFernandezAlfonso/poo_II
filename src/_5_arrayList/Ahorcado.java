package _5_arrayList;

import java.util.ArrayList;

public class Ahorcado {

	String palabraFinal;
	int numIntento;
	
	
	
	/*public Ahorcado(String palabraFinal) {
		this.palabraFinal = palabraFinal;
	}*/

	
	public void jugar(String palabra) {
		if(palabra.equals(palabraFinal)) {
			System.out.println("Has acertado");
		}
		else{System.out.println("Sigue jugando");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> listaPalabras = new ArrayList<>();

		listaPalabras.add("carlos");listaPalabras.add("pablo");
		
		
		
		
		//Ahorcado a1 = new Ahorcado("Hola");
		//a1.jugar("hola");
		
		
	}
	
}
