package bateriadeejercicios;
import java.util.*;

public class Ejercicio26 {
	public static void main(String[] args) {
		Scanner es = new Scanner(System.in);
		/*/ Un programa que calcule el producto de N números ingresados por 
		el usuario./*/
		
		int Producto=1,N;
		System.out.println("Ingrese N numeros :");
		N=es.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println(i + "");
			Producto*=i;
			
		}
		System.out.println("\nProducto de " + N + " :" + Producto);
	
		es.close();
	}

}