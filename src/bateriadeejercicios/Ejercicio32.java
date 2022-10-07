package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio32 {
	//Ejercicio 32
	
	public static int MCD(int x,int y) {
		if( x % y == 0) {
			return y;
		}else {
			return MCD(y , x % y);
		}
	}
	
	public static void main(String[] args) {
	
		Scanner es =  new Scanner(System.in); 
		
		int x,y;
	
		System.out.println("Ingrese el primero numero :");
	
		x=es.nextInt();
	
	
		System.out.println("Ingrese el segundo numero :");

		y=es.nextInt();
	
	
		System.out.println("El maximo comun divisior es : " +  MCD(x,y));
		
  
  
		

	}
	
}
