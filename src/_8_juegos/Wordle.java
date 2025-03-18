package _8_juegos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wordle {

	int numIntento;

	public static char[] convertir(String palabra) {
		char[] palabraSeparada = new char[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
			palabraSeparada[i] = palabra.charAt(i);
		}
		return palabraSeparada;
	}

	public static String reConvertir(char[] lista) {
		String palabraJunta = null;
		for (int i = 0; i < lista.length; i++) {
			palabraJunta = "" + lista[i];			
		}
		return palabraJunta;
	}
	
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		String intento;
		boolean adivinado = false;
		Random random = new Random();
		ArrayList<String> palabras = new ArrayList<>(Arrays.asList("sol", "luz", "aire", "flor", "cielo", "mar", "rio",
				"nube", "piedra", "tierra", "lago", "campo", "hoja", "bosque", "lluvia", "nieve", "trueno", "viento",
				"brisa", "rayo", "perro", "gato", "pato", "pez", "oso", "lobo", "rata", "vaca", "cerdo", "zorro", "pan",
				"arroz", "fruta", "queso", "leche", "agua", "jugo", "sal", "azúcar", "harina", "mesa", "silla",
				"puerta", "ventana", "pared", "techo", "piso", "cama", "sofa", "lámpara", "lapiz", "papel", "libro",
				"hoja", "tinta", "cuadro", "pluma", "tijera", "cuerda", "soga", "rojo", "azul", "verde", "amarillo",
				"negro", "blanco", "rosa", "morado", "naranja", "gris", "tren", "avion", "barco", "bici", "auto",
				"taxi", "camion", "moto", "metro", "carro", "calle", "avenida", "plaza", "parque", "puente", "tunel",
				"torre", "edificio", "catedral", "castillo"));

		String palabraAleatoria = palabras.get(random.nextInt(palabras.size()));
		int tamanio = palabraAleatoria.length();
		// String[] palabraComparar = new String[tamanio];
		//System.out.println(palabraAleatoria);
		System.out.printf("La palabra tiene %d letras, intenta adivinarla:", tamanio);
		String rojo = "\033[31m";
        String verde = "\033[32m";
        String reset = "\033[0m";
		char[] palabraSeparada = convertir(palabraAleatoria);
		char[] resultadoSeparado = new char[tamanio];
		while (!adivinado) {
			System.out.println();
			intento = scaner.nextLine();
			char[] intentoSeparado = convertir(intento);
			if (intento.length() != tamanio) {
				System.out.printf("La palabra debe tener exactamente %d letras. Inténtalo de nuevo.", tamanio);
			} else {
				if (!intento.trim().equalsIgnoreCase(palabraAleatoria)) {
					// System.out.println("Error dame otra palabra: ");
					for (int i = 0; i < tamanio; i++) {
					    if (intentoSeparado[i] == palabraSeparada[i]) {
					        resultadoSeparado[i] = intentoSeparado[i];
					        System.out.print(verde + resultadoSeparado[i] + reset); // Letras correctas en verde
					    } else {
					        System.out.print(rojo + intentoSeparado[i] + reset); // Letras incorrectas en rojo
					    }
					}
					System.out.println();
					for (int i = 0; i < tamanio; i++) {

						if (intentoSeparado[i] == palabraSeparada[i]) {
							resultadoSeparado[i] = intentoSeparado[i];
						}
						System.out.print(resultadoSeparado[i] != '\u0000' ? resultadoSeparado[i] : "□");
					}
					//System.out.println();
					
					/*for (int i = 0; i < tamanio; i++) {
						if (resultadoSeparado2[i] == palabraSeparada[i]) {
							System.out.print(resultadoSeparado2[i] + rojo);
						}else {
							System.out.print(resultadoSeparado2[i] + verde);
						}
					}*/
				} else {
					System.out.printf("Has ganado, la palabra era: %s.", palabraAleatoria);
					scaner.close();
					break;
				}
			}
		}
	}
}
