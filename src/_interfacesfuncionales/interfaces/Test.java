package _interfacesfuncionales.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static <E> void main(String[] args) {
		Mosca m = new Mosca();
		Animal ma = new Mosca();
		Perro p = new Perro();
		Animal pa = new Perro();
		
		Animal[] animales = {ma, pa, p, m };
		List<Animal> Listanimales = new ArrayList<>(Arrays.asList(animales));
		
		Mosca m1 = new Mosca();
		Avion a1 = new Avion();
		Volador mv1 = new Mosca();
		Volador av1 = new Avion();
		
		Volador[] voladores = {mv1, av1, m1, a1 };
		
		for (Volador volador : voladores) {
			// si el volador es animal que respire
			if(volador instanceof Animal) { 
			((Animal) volador).respirar();
			}
			volador.planear();
			
		}
		
		
		
		
		
	}
}
