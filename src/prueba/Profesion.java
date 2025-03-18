package prueba;

public abstract class Profesion {

	private String nombre;
	private short anioDeNacimiento;
	private String especialidad;
	
	
	
	public Profesion(String nombre, short anioDeNacimiento, String especialidad) {
		super();
		this.nombre = nombre;
		this.anioDeNacimiento = anioDeNacimiento;
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public short getAnioDeNacimiento() {
		return anioDeNacimiento;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	
	public abstract void trabajar();
	
	public short calcularEdad() {
		return (short) (2025 - anioDeNacimiento);
	}
	@Override
	public String toString() {
		return "Profesion [nombre=" + nombre + ", anioDeNacimiento=" + anioDeNacimiento + ", especialidad="
				+ especialidad + "]";
	}
	
}
