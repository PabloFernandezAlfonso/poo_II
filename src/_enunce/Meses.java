package _enunce;

public enum Meses {

	EN(1, "January", "Enero"), FB(2, "February", "Febrero"), MR(3, "March", "Marzo"), AB(4, "April", "Abril"),
	MY(5, "May", "Mayo"), JN(6, "June", "Junio"), JL(7, "January", "Julio"), AG(8, "Agust", "Agosto"),
	SP(9, "September", "Septiembre"), OC(10, "October", "Octubre"), 
	NV(11, "November", "Noviembre"),DC(12, "December", "Diciembre");
	
	private int diasDelMes;
	private String nombreEN;
	private String nombreES;

	public int getDiasDelMes() {
		return diasDelMes;
	}
	public String getNombreEN() {
		return nombreEN;
	}
	public String getNombreES() {
		return nombreES;
	}
	private Meses(int diasDelMes, String nombreEN, String nombreES) {
		this.diasDelMes = diasDelMes;
		this.nombreEN = nombreEN;
		this.nombreES = nombreES;
	}
	/*public static String show() {
		return String.format("El mes %d del finde es el %s (%s)", diasDelMes,nombreES ,nombreEN);
	}*/
	
	
}
