package _a12_collectionsEnum;

import java.util.Objects;

public class Coche {

	private Marca marca;
	private Color  color;
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	public Coche() {
		marca = Marca.aleatorio();
		color = Color.aleatorio();
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + "]" + "(" + hashCode() + ")";
	} public Marca getMarca() {
	        return marca;
	    }

	    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}
	    
	    
		public Color getColor() {
	        return color;
	    }
	
}
