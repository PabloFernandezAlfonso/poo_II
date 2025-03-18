package prueba;

public class Profesor extends Profesion{

	public Profesor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El profesor [%s] está enseñando [%s] a sus estudiantes.%n", getNombre(), getEspecialidad());
	}
	
	public void calificarexamenes(int cantidadEstudiantes) {
	System.out.printf("El profesor [%s] ha calificado [%s] exámenes.%n", getNombre(), cantidadEstudiantes);
	}
	
	
	
}
