package prueba;

public class Telefono {

	private boolean estado;
	private double bateriaActual;
	private double bateriaTotal;
	private String modelo;
	private String marca;
	
	public boolean isEstado() {
		return estado;
	}

	public double getBateriaActual() {
		return bateriaActual;
	}

	public double getBateriaTotal() {
		return bateriaTotal;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	
	
	public Telefono(String modelo, String marca) {
		estado = bateriaActual <= bateriaTotal * 0.02 ? false : false;
		bateriaTotal = 100;
		bateriaActual = bateriaActual > bateriaTotal ? bateriaTotal : bateriaTotal * 0.2;
		this.modelo = modelo;
		this.marca = marca;
	}


	public boolean botonDeArranque() {
		if (estado == false) {
		return estado = true;
		}else {
			return estado = false;
		}
	}
	
	public boolean consultarEstado() {
		return estado;
	}
	//revisar mas adelante-------------------------------------
	public boolean llamar() {
		bateriaActual = bateriaActual - (bateriaTotal * 0.02);
		return true;
	}
	
	public boolean navegarInternet() {
		bateriaActual = bateriaActual - (bateriaTotal * 0.01);
		return true;
	}
	//crear  nuevos telefonos
	
	
	
	public boolean modoBajoConsumo() {
		if(bateriaActual < bateriaTotal * 0.1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean comprobarModoBajoConsumo() {
		if(modoBajoConsumo() == true) {
			System.out.println("El telefono está en modo bajo consumo");
			return true;
		}else {
			System.out.println("El telefono no está en modo bajo consumo");
			return false;
		}
	}
	
	public boolean apagarPorBateriaBaja() {
		if(bateriaActual <= bateriaTotal * 0.02) {
			return estado = false;
		}else {
			return false;
		}
	}
	
	public boolean recargarBateria() {
		if(bateriaActual <= bateriaTotal) {
			bateriaActual = bateriaActual + bateriaTotal * 0.25;
			return true;
		}else {
			return false;
		}
	}
	
	public void show() {
		System.out.printf("Telefonos de marca: %s, modelo: %s, con una bateria actual de: %.0f %%, y un estado: %b.%n", marca,modelo, bateriaActual, estado);
	}
	

	public static void main(String[] args) {
		
		Telefono t1 = new Telefono("12T", "Xiaomi");
		
		System.out.println("Primero vemos los datos basicos");
		System.out.println("----------------------------------------------------------------------------------------------");
		t1.show();		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Comprobamos si funciona el botón de arranque");		
		System.out.println("----------------------------------------------------------------------------------------------");
		t1.botonDeArranque();
		t1.show();
		t1.botonDeArranque();
		t1.show();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Comprobamos si la llamada quita el porcentaje adecuado, lo mismo con el uso del navegador");
		t1.show();
		t1.llamar();
		t1.show();
		t1.navegarInternet();
		t1.show();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Revisamos el modo de bajo consumo");
		System.out.println("----------------------------------------------------------------------------------------------");
		t1.llamar();t1.llamar();
		t1.modoBajoConsumo();
		t1.show();
		t1.comprobarModoBajoConsumo();
		t1.llamar();t1.llamar();
		t1.modoBajoConsumo();
		t1.show();
		t1.comprobarModoBajoConsumo();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Ahora comprobaremos apagado por bateria baja");
		System.out.println("----------------------------------------------------------------------------------------------");
		t1.botonDeArranque();
		t1.show();
		t1.llamar();t1.llamar();t1.llamar();t1.llamar();
		//t1.apagarPorBateriaBaja();
		t1.show();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Recargar Bateria hasta el límite");
		System.out.println("----------------------------------------------------------------------------------------------");
		t1.llamar();
		t1.recargarBateria();
		t1.show();
		t1.recargarBateria();
		t1.recargarBateria();
		t1.recargarBateria();
		t1.recargarBateria();
		t1.recargarBateria();
		t1.show();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Faltarían configurar correctamente los límites de los constructores y revisar la estructura de"
				+ " las baterias para poder enseñarlo con porcentajes sin importar el tamaño de las mismas.");
		System.out.println("----------------------------------------------------------------------------------------------");
		

		
		
		
		
	}
}
