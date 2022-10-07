package bateriadeejercicios;

import java.util.*;
public class Ejercicio37 {

	public static void main(String[] args) {
	int n,i=0;
	//Ejercicio 37
	
	Scanner es = new  Scanner(System.in);
	
	System.out.println("Ingrese un numero :");
	n=es.nextInt();
	
	  while(n>1) {
		  if(n%2==0) {
			  n=n/2;
			  
		  }
		  
		  else {
			  n=-n*3+1;
			  i=i+1;
		  }
		  System.out.println(i);
		  
	  }
	  
	}
	
}