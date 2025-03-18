package _a12_collectionsEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Parking {

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
    
	public Parking(String nombre, int plazasTotales) {
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
//			mapCoches.put(coche, mapCoches.getOrDefault(coche, 0) + 1);
			
			
			setCoches.add(clave);
			return true;
		}
		return false;
	}

	public boolean saleCoche(Coche coche) {
		for (int i = 0; i < listaCoches.size(); i++) {
			if (listaCoches.get(i) == coche) {
				plazasLibres++;
				listaCoches.remove(i);
				conjuntoCoches.remove(coche);
				//Iguales revisar
				
				Color color = coche.getColor();
	            int countColor = contadorColores.get(color);
	            if (countColor == 1) {
	                contadorColores.remove(color); 
	            } else {
	                contadorColores.put(color, countColor - 1); 
	            }
				
	            Marca marca = coche.getMarca();
	            int countMarca = contadorMarcas.get(marca);
	            if (countMarca == 1) {
	                contadorMarcas.remove(marca); 
	            } else {
	                contadorMarcas.put(marca, countMarca - 1); 
	            }
				
				String clave = coche.getMarca().name() + " " + coche.getColor().name();
				int count = contadorCochesIguales.get(clave);
				if (count == 1) {
					contadorCochesIguales.remove(clave);
					setCoches.remove(clave);
				} else {
					contadorCochesIguales.put(clave, count - 1);
				}
				return true;
			}
		}
		return false;
	}

	public  Coche saleCocheAleatorio() {
		if (plazasLibres == 0 || listaCoches.isEmpty()) {
			return null;
		}
		int indiceAleatorio = random.nextInt(listaCoches.size());
		Coche cocheAleatorio = listaCoches.get(indiceAleatorio);
		
		listaCoches.remove(indiceAleatorio);
		conjuntoCoches.remove(cocheAleatorio);
		plazasLibres++;
		
		Color color = cocheAleatorio.getColor();
	    int countColor = contadorColores.get(color);
	    if (countColor == 1) {
	        contadorColores.remove(color);
	    } else {
	        contadorColores.put(color, countColor - 1); 
	    }
	    
	    Marca marca = cocheAleatorio.getMarca();
        int countMarca = contadorMarcas.get(marca);
        if (countMarca == 1) {
            contadorMarcas.remove(marca); 
        } else {
            contadorMarcas.put(marca, countMarca - 1); 
        }
	    
		String clave = cocheAleatorio.getMarca().name() + " " + cocheAleatorio.getColor().name();
	    int count = contadorCochesIguales.get(clave);
	    if (count == 1) {
	        contadorCochesIguales.remove(clave);
	        setCoches.remove(clave);
	    } else {
	        contadorCochesIguales.put(clave, count - 1);
	    }

	    return cocheAleatorio;
	}

	public boolean vaciaParking() {
		if (listaCoches.isEmpty()) {
			return false;
		}
		while (!listaCoches.isEmpty()) {
//			Coche coche = listaCoches.get(0);
			saleCocheAleatorio();
			//saleCoche(coche);
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
					.println("El coche de color " + color.getNombre() + " se repite " + veces + " " + vecesTexto + ".");
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
		System.out.println("REPORT DE COCHES IGUALES");
		System.out.println("------------------------");
		System.out.println("Parking: " + nombre);

		for (Map.Entry<String, Integer> lista : contadorCochesIguales.entrySet()) {
			String clave = lista.getKey();
			int veces = lista.getValue();
			String vecesTexto = (veces == 1) ? "vez" : "veces";
			System.out.println("Coche: " +  clave + " se repite " + veces + " " + vecesTexto + ".");
		}

		System.out.println("Total coches: " + listaCoches.size());
	}

	public void reportSetCoches() {
	    System.out.println("REPORT SET DE COCHES");
	    System.out.println("--------------------");
	    System.out.println("Parking: " + nombre);

	    for (String clave : setCoches) {
	        System.out.println("Coche: " + clave);
	    }

	    System.out.println("Total items: " + setCoches.size());
	}
	
	public  void sacarTodosLosMetodos(){
		reportParking();
		reportColores();
		reportMarcas();
		reportCochesIguales();
		reportSetCoches();
		System.out.println();
		System.out.println();
	}

	
	
}
