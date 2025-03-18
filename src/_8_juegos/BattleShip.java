package _8_juegos;

public class BattleShip {

	public static void main(String[] args) {
		int numColumnas = 5;
		int numFilas = 5;
		char[] abecedario = new char[numColumnas];
		String[][] array2D = new String[numFilas][numColumnas];
		for (int f = 0; f < array2D.length; f++) {
			for (int c = 0; c < array2D[f].length; c++) {
				if (f == numColumnas - 1) {
					array2D[f][c] = c + 1 + " ";
				} else if (f == --numFilas) {
					array2D[f][c] = "A";
				} else {
					array2D[f][c] = "*  ";
				}
			}
		}
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
	}

}
