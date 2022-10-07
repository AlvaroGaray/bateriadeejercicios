package bateriadeejercicios;

import java.util.*;

public class Ejercicio14 {

		/*/ .Dada una secuencia de números leídos por teclado, que acabe con 
		un –1, por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el programa
		que calcule la media aritmética. Suponemos que el usuario no 
		insertará número negativos. /*/
	
	public static void main(String[] args) {
		Scanner es = new Scanner(System.in);
		
		int num,suma,elementos;
		double media;
		
		System.out.println("Introduzca un numero :");
		num=es.nextInt();
		
		suma=0;
		elementos=0;
		
		while(num>=0) {
			suma+=num;
			elementos++;
			
			System.out.println("Introduzca otro numero:");
			num=es.nextInt();
			
		}
		if(elementos==0) {
			System.out.println("Imposible realizar la media");
			
		} 
		else {
			media=(double)suma/elementos;
			System.out.println("La media es :" + media);
		}
		
		es.close();
	}

}