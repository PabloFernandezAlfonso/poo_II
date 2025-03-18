package _enunce;

import java.util.Iterator;

public class Run {

//1. Dado un mes, indica su nombre en inglés, en español y su número de mes.
//2. Dado un número indica, si es que tiene correspondencia, su nombre de mes en español y en inglés.

	
	/*public String introducirMes(String mes) {
	    for (Meses m : Meses.values()) {
	        if (m.getNombreES().equalsIgnoreCase(mes)) {
	            return m.show(); // Devuelve la información del mes encontrado
	        }
	    }
	    return "Incorrecto"; // Mensaje en caso de que el mes no sea encontrado
	}
	public static void main(String[] args) {
		System.out.println("Introduce la abreviatura de un mes (EN, FB, MR, AB, MY, JN, JL, AG,SP, OC, NV, DC)");
		
		
	}
*/
	
	public static void main(String[] args) {
        System.out.println(Pruebas.ENE);
        System.out.println(Pruebas.dameDatosPorMes(Pruebas.FEB));
        System.out.println(Pruebas.dameNombresPorNumero(2));
    }
	
}
