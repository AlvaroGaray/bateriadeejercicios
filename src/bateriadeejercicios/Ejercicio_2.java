package bateriadeejercicios;
import java.util.*;

public class Ejercicio_2 {
	
	public static void main(String[] args) {
		
		/*/Programa que lea dos números y nos diga cuál de ellos es mayor o 
		bien si son iguales. /*/
		
		Scanner es=new Scanner(System.in);
		int a, b;
		do{System.out.println("Ingrese el valor de a");
		a=es.nextInt();}while(a<0);
		do{System.out.println("Ingrse el valor de b");
		b=es.nextInt();}while(b<0);
		
		if(a > b) {
			System.out.println("El numero mayor es a:"+a);
		} else {
			System.out.println("El numero mayor es b:"+b);
		}
		if(a == b) {
			System.out.println("Ambos numero son iguales ");
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			
			es.close();
		}
	}
}