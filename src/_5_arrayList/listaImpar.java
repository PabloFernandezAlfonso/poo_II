package _5_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class listaImpar {

	
	public static void main(String[] args) {
		
		int cantidadNum = 3;
		int multiploDe = 4;
		int numInicial = 5;
		

		
		ArrayList<Integer> listaPar = new ArrayList<Integer>(); 
		ArrayList<Integer> listaMultiplos = new ArrayList<>();
		ArrayList<String> listaChar = new ArrayList<>(); 
		Random randomChar = new Random();
		/*Crea un ArrayList de Strings de 4 letras aleatorias del alfabeto
		inglés en minúsculas, con 1000 palabras. Luego recórrelo y crea
		otro nuevo ArrayList, donde estén las palabras que terminan por
		a o c. Muestra este último e indica cuántas palabras tiene.*/
		
		for (int i = 0; i < cantidadNum; i++) {
			listaPar.add(i * 2);
		}
		int num = numInicial;
		int contador = 0;
		while (contador < cantidadNum) {
			if(num % multiploDe == 0) {
				contador++;
				listaMultiplos.add(num);
			}
			num++;
		}
		
		/*String palabra = "";
		char letra = (char)randomChar.nextInt('a', 'z' + 1);
		palabra.concat(""+letra);
		for (int i = 0; i < cantidadNum; i++) {
			//listaChar.add();
		}*/
		
		
		
		System.out.println(listaPar);
		System.out.println(listaMultiplos);
		
		ArrayList<String> palabras = new ArrayList<>();
        ArrayList<String> filtradas = new ArrayList<>();
        Random random = new Random();
        String letras = "abcdefghijklmnopqrstuvwxyz";

        // Generar 1000 palabras aleatorias de 4 letras
        for (int i = 0; i < 1000; i++) {
            StringBuilder palabra = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                palabra.append(letras.charAt(random.nextInt(letras.length())));
            }
            palabras.add(palabra.toString());
        }

        // Filtrar palabras que terminan en 'a' o 'c'
        for (String palabra : palabras) {
            char ultimaLetra = palabra.charAt(3); // Cuarta letra
            if (ultimaLetra == 'a' || ultimaLetra == 'c') {
                filtradas.add(palabra);
            }
        }

        // Mostrar palabras filtradas y cantidad
        System.out.println("Palabras que terminan en 'a' o 'c': " + filtradas);
        System.out.println("Total de palabras filtradas: " + filtradas.size());

		
	}
	
	
}
