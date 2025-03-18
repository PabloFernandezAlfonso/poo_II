package _enunce;

public enum FinDe {

	VI(5, "Viernes", "Friday"), SA(6, "Sabado", "Saturday"), DO(7, "Domingo", "Sunday"); //Literales, nombres de referencia
	
	private int numeroDia;
	private String nombreEnEspanol;
	private String nombreEnIngles;

	private FinDe(int numeroDia, String nombreEnEspanol, String nombreEnIngles) {
		this.numeroDia = numeroDia;
		this.nombreEnEspanol = nombreEnEspanol;
		this.nombreEnIngles = nombreEnIngles;
	}
	public int getNumeroDia() {
		return numeroDia;
	}
	public String getNombreEnEspanol() {
		return nombreEnEspanol;
	}
	public String getNombreEnIngles() {
		return nombreEnIngles;
	}
	public void setNumeroDia(int numeroDia) {
		this.numeroDia = numeroDia;
	}
	public String presentacion() {
		return String.format("El dia %d del finde es el %s (%s) ", numeroDia,nombreEnEspanol, nombreEnIngles);
	}
	
	
	
}
