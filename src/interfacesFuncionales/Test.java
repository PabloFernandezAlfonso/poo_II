package interfacesFuncionales;import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public List<Integer> filtra(int[] numeros, FiltroEnteros f) {
		List<Integer> listaFiltrada = new ArrayList<>();
		for (int num : numeros) {
			if(f.filtrar(num)){
				listaFiltrada.add(num);
			}
		}
		return listaFiltrada;
		
	}
	
	public static void main(String[] args) {
		
		Operaciones operaciones= new  Operaciones();
		int num = 2;
//		System.out.println(f.cuadrado(2));
//		System.out.println(f.cubo(2));
//		System.out.println(f.doble(2));
//		System.out.println(f.triple(2));
//		System.out.println(f.polinomio(2));
//		System.out.println(f.polinomioVariable(2, 2, 2, 2));
		
//		OperacionEntraEnteroSaleEntero cuadrado =(int s) ->{return s * s ; };
//		OperacionEntraEnteroSaleEntero cubo = s -> s * s * s; 
//		OperacionEntraEnteroSaleEntero doble = s -> s * 2;                                             
//		OperacionEntraEnteroSaleEntero triple = s -> s * 3;
//		OperacionEntraEnteroSaleEntero polinomio = s -> 5 * s * s * s + 7 * s * s + 9;                                             
//		OperacionEntraCuatroEnterosSaleEntero polinomioVariableple = (s, a, b, c) -> a * s * s * s + b * s * s + c;                                             
//		System.out.println(cuadrado.dale(num));
//		System.out.println(cubo.dale(num));
//		System.out.println(doble.dale(num));
//		System.out.println(triple.dale(num));
//		System.out.println(polinomio.dale(num));
//		System.out.println(polinomioVariableple.dale(num, 5, 7, 9));
		
		OperacionEntraDoubleSaleDouble mitad = x -> x / 2;
		OperacionEntraDoubleSaleDouble cuartaParte = x -> x / 4;
		OperacionEntraDoubleSaleDouble decimaParte = x -> x / 10;
		OperacionEntraDoubleIntSaleDouble nSimaParte= (x, p) -> x / p;
		System.out.println(mitad.dale(num));
		System.out.println(cuartaParte.dale(num));
		System.out.println(decimaParte.dale(num));
		System.out.println(nSimaParte.dale(num, num));

//		operaciones.filtra(new int[] {2, 3, -7, -5}, s -> s >0);
		
	}
}
