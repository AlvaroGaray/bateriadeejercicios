package bateriadeejercicios;
import java.util.*;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		/*/ Se pide representar el programa que nos calcule la suma de 
		los N primeros números naturales. N se leerá por teclado/*/
		
		Scanner es = new Scanner(System.in);
		int n,suma=0;
		System.out.println("Ingrese una cantidad");
		n=es.nextInt();
		
		for(int i=0;i<=n;i++) {
			 suma+=i;
		}
		
		
		System.out.println("La suma de los "+n+" primeros numeros naturales es "+ suma);
		
		es.close();
		
	}
}