package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio31 {
	/*/.Dado un número entero n, encuentre sus divisores /*/
  public static final int N = 0;

	public static void main(String[] args) {
		
		Scanner es = new Scanner(System.in);	
		
	do {
		
			System.out.println("\nIntroduzca un numero N :");
			int N=es.nextInt();
		
		for (int i = 1; i <N; i++) {
				
		
		
		if(N%i==0) 
			System.out.print(i + " ");
			
		}
	    }while(N<1);
	}
	

}
