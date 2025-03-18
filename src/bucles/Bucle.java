package bucles;

public class Bucle {

	static int intento;

	
	
	
	public static void main(String[] args) {
		
		int [] [] array2D = new int [4][7];
		for (int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
			array2D[i][j] = 2;
			}
		}
		for (int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
			System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		/*
		 * 
		 * 
		 * 
		 * 
				for(int k = 0; k < array2D[j].length; k++) {
					array2D[i][j][k] = 1;
					}
			}
		}
		for (int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
			array2D[i][j] = 1;
				for(int k = 0; k < array2D[j].length; k++) {
					array2D[i][j][k] = 1;
					}
			}
		}
		 * 
		 * 
		 * System.out.println();
		while (intento <= 10) {
			System.out.print(intento + " ");
			++intento;
		}
		System.out.println();
		intento = 0;
		do {
			System.out.print(intento + " ");
			++intento;
		} while (intento <= 10);*/
		
	}

}
