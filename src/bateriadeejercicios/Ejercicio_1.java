package bateriadeejercicios;
import java.util.*;

public class Ejercicio_1 {
	public static void main(String[] args) {
		
		/*/Dadas dos variables numéricas A y B, que el usuario debe teclear, se 
		pide realizar un programa que intercambie los valores de 
		ambas variables y muestre cuánto valen al final las dos variables./*/
		
		Scanner es=new Scanner(System.in);
		int a, b ;
		System.out.println("Digite el valor A");
		a=es.nextInt();
		System.out.println("Digite el valor B");
		b=es.nextInt();
		System.out.println("El valor de A es:"+a);
		System.out.println("El valor de b es:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("El nuevo valor de A es:"+a);
		System.out.println("El nuevo valor de b es:"+b);
		
		es.close();
		
	}
}