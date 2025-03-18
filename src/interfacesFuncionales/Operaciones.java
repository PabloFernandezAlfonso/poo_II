package interfacesFuncionales;

public class Operaciones implements OperacionEntraEnteroSaleEntero {

	 public int cuadrado(int x) {
		int cuadrado = x * x;
//		System.out.println(cuadrado);
		return cuadrado;
	}

	 public  int cubo(int x) {
		int cubo = x * x * x;
//		System.out.println(cubo);
		return x * x * x;
	}

	 public  int doble(int x) {
		int doble = x * 2;
//		System.out.println(doble);
		return x * 2;
	}

	 public  int triple(int x) {
		int triple = x * 3;
//		System.out.println(triple);
		return x * 3;
	}

	 public  int polinomio(int x) {
		int polinomio = 5 * x * x * x + 7 * x ^ 2 + 9;
//		System.out.println(polinomio);
		return polinomio;
	}

	 public  int polinomioVariable(int x, int a, int b, int c) {
		int polinomioVariable = a * x ^ 3 + b * x * x + c;
//		System.out.println(polinomioVariable);
		return polinomioVariable;
	}

	@Override
	public int dale(int i) {
		// podria hacer cuadrado, cubo, etc...
		return 0;
	}

}
