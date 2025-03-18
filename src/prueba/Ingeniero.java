package prueba;

public class Ingeniero  extends Profesion{

	public Ingeniero(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El ingeniero [%s] está diseñando un proyecto de [%s].%n", getNombre(), getEspecialidad());
		return;
	}
	
	public double calcularCostoProyecto(double horas, double tarifaPorHora) {
		double costeDelProyecto = horas * tarifaPorHora;
		System.out.printf("El coste del proyecto será: %.2f€.%n", costeDelProyecto);
		return costeDelProyecto;
	}
	
	
	
	
}
