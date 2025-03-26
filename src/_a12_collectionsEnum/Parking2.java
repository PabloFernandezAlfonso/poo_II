package _a12_collectionsEnum;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Parking2 {

	private String nombre;
	private int plazasTotales;
	private List<Coche> listaCoches;
	private int plazasLibres;
	private Set<Coche> conjuntoCoches;
	private static Random random = new Random();
	private Map<Color, Integer> contadorColores;
	private Map<Marca, Integer> contadorMarcas;
	private Map<String, Integer> contadorCochesIguales;
    private Set<String> setCoches;
    // Extra
    private Map<Coche, Integer> mapCoches;
    
    
	public Parking2(String nombre, int plazasTotales) {
		this.nombre = nombre;
		this.plazasTotales = plazasTotales;
		plazasLibres = plazasTotales;
		listaCoches = new ArrayList<>();
		this.conjuntoCoches = new HashSet<>();
		this.contadorColores = new HashMap<>();
		this.contadorMarcas = new HashMap<>();
		this.contadorCochesIguales = new HashMap<>();
		this.setCoches = new HashSet<>();
	}

	
	public int getPlazasTotales() {
		return plazasTotales;
	}


	public void setPlazasTotales(int plazasTotales) {
		this.plazasTotales = plazasTotales;
	}


	public List<Coche> getListaCoches() {
		return listaCoches;
	}

	public Set<Coche> getConjuntoCoches() {
		return conjuntoCoches;
	}

	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}

	public boolean entraCoche(Coche coche) {
		boolean cocheDentro = false;
		for (Coche c : listaCoches) {
			if (c == coche) {
				cocheDentro = true;
				break;
			}
		}
		if (plazasLibres > 0 && !cocheDentro) {
			plazasLibres--;
			listaCoches.add(coche);
			conjuntoCoches.add(coche);

			Color color = coche.getColor();
			contadorColores.put(color, contadorColores.getOrDefault(color, 0) + 1);
// 			Todo junto			
//			contadorColores.put(coche.getColor(), contadorColores.getOrDefault(coche.getColor(), 0) + 1);
			
			Marca marca = coche.getMarca();
			contadorMarcas.put(marca, contadorMarcas.getOrDefault(marca, 0) + 1);
			//Iguales revisar
			String clave = coche.getMarca().name() + " " + coche.getColor().name();
			contadorCochesIguales.put(clave, contadorCochesIguales.getOrDefault(clave, 0) + 1);
			//Otra manera de registrar los coches enteros sin que sea un String
			mapCoches.put(coche, mapCoches.getOrDefault(coche, 0) + 1);
			
			
			setCoches.add(clave);
			return true;
		}
		return false;
	}

	public Coche saleCoche(Coche coche) {
		
		boolean cocheDentro = false;
		int indiceCoche = 0;
		for (int i = 0; i < listaCoches.size(); i++) {
			if (listaCoches.get(i) == coche) {
				indiceCoche = i;
				cocheDentro = true;
				break;
			}
		}
		if (!cocheDentro) {
			plazasLibres++;
			listaCoches.remove(indiceCoche);
			conjuntoCoches.remove(coche);

			contadorColores.put(coche.getColor(), contadorColores.get(coche.getColor()) - 1);
			if(contadorColores.get(coche.getColor()) == 0) {
				contadorColores.remove(coche.getColor()) ;
			}
			contadorMarcas.put(coche.getMarca(), contadorMarcas.get(coche.getMarca()) - 1);
			if(contadorMarcas.get(coche.getMarca()) == 0) {
				contadorMarcas.remove(coche.getMarca()) ;
			}
			mapCoches.put(coche, mapCoches.get(coche) - 1);
			if(mapCoches.get(coche) == 0) {
				mapCoches.remove(coche) ;
				conjuntoCoches.remove(coche);
			}
			
			return coche;
		}
		return null;
	}

	public  Coche saleCocheAleatorio() {
// Arriba		Random random= new Random();
		if(listaCoches.isEmpty()) return null;
		
		int indiceAleatorio = random.nextInt(listaCoches.size());
		return saleCoche(listaCoches.get(indiceAleatorio));
	}

	public boolean vaciaParking() {
		if (listaCoches.isEmpty()) {
			return false;
		}
		while (!listaCoches.isEmpty()) {
			saleCocheAleatorio();
		}
		return true;
	}

	public void reportParking() {
		System.out.println("LISTADO COCHES");
		System.out.println("--------------");
		System.out.println("Parking: " + nombre);
		for (Coche coche : listaCoches) {
			System.out.println("  Coche: " + coche.getMarca().name() + " " + coche.getColor().name());
		}

		System.out.println("Total coches: " + listaCoches.size() + ", plazas libres: " + plazasLibres + ".");
	}

	public void reportColores() {
		System.out.println("REPORT DE COLORES");
		System.out.println("-----------------");
		System.out.println("Parking: " + nombre);

		for (Map.Entry<Color, Integer> lista : contadorColores.entrySet()) {
			Color color = lista.getKey();
			int veces = lista.getValue();
			String vecesTexto = (veces == 1) ? "vez" : "veces";
			System.out
					.println("El coche de color " + color.getNombre() + " se repite " + veces + ".");
		}

		
		System.out.println("Total coches: " + listaCoches.size());
	}

	public void reportMarcas() {
		System.out.println("REPORT DE MARCAS");
		System.out.println("-----------------");
		System.out.println("Parking: " + nombre);

		for (Map.Entry<Marca, Integer> lista : contadorMarcas.entrySet()) {
			Marca marca = lista.getKey();
			int veces = lista.getValue();
			String vecesTexto = (veces == 1) ? "vez" : "veces";
			System.out
					.println("El coche de marca " + marca.getNombre() + " se repite " + veces + " " + vecesTexto + ".");
		}

		System.out.println("Total coches: " + listaCoches.size());
	}

	public void reportCochesIguales() {
		
		for (Coche coche : mapCoches.keySet()) {
				System.out.printf("Coche de marca %s y modelo %s se repite %d ve%s %n",
						coche.getMarca(),
						coche.getColor(),
						mapCoches.get(coche),
						mapCoches.get(coche) == 1 ? "z": "es");	
		}
	}
	
	public  void sacarTodosLosMetodos(){
		reportParking();
		reportColores();
		reportMarcas();
		reportCochesIguales();
//		reportSetCoches();
		System.out.println();
		System.out.println();
	}

	
	
}
