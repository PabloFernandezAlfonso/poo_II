package _8_juegos;

public class Pruebas {

	public static char[] convertir(String palabra) {
		char[] palabraSeparada = new char[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
			palabraSeparada[i] = palabra.charAt(i);
		}
		return palabraSeparada;
	}

	//reConvertir va a volver a convertir el array en un string
	public static String reConvertir(char[] lista) {
		String palabraJunta = null;
		for (int i = 0; i < lista.length; i++) {
			palabraJunta = "" + lista[i];			
		}
		return palabraJunta;
	}
	
	//Otro metodo que compare array1[1] con array[i] y especifique si algun array1 es igual a algun array2[i] 
	
	public static void main(String[] args) {
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println();			
		}
	}
	
	
}
