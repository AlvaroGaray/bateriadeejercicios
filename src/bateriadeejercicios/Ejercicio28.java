package bateriadeejercicios;

import java.util.*;

public class Ejercicio28 {
	
	public static void main(String[] args) {
		
		/*/.Diseñar un programa que, dados 10 números naturales, indique 
		cuántos de ellos son números pares, nos muestre estos y calcule la 
		media aritmética de los impares. /*/
		Scanner entrada = new Scanner(System.in);
		
		
		int suma=0;
		
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Digite un numero:");
			int num=entrada.nextInt();
			
		if(num%2==0) {
			System.out.println("Es par");
			
		}else {
		   System.out.println("Es impar");
		   
		 }
	
			
		
		System.out.println("La media  de los inpares :"  + (suma/10.0));
		}   
		}
		
	}