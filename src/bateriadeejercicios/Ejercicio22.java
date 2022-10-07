package bateriadeejercicios;
import java.util.*;

public class Ejercicio22 {
int año;
	
	Scanner es = new Scanner(System.in);
	
	  public void entradaño() {
		  /*/ Programa que, dado un año, nos diga si es bisiesto o no. Un año es 
		bisiesto bajo las siguientes condiciones:
		• Un año divisible por 4 es bisiesto y no debe ser divisible entre 100.
		• Si un año es divisible entre 100 y además es divisible entre 400, 
		también resulta bisiesto.
		• NOTA: este ejercicio tiene muchas formas de hacerlo./*/
		  System.out.println("Metodo para determinar si el año es biciesto o no");
		  System.out.println("Ingrese el año a evaluar :");
		  año=es.nextInt();
		  
		  
		if((año % 4==0) && (año % 100 !=0 || año % 400 ==0)) {
			  System.out.println("Es un año biciesto " + año);
		  }
		else {
			System.out.println("No es un año biciesto " + año);
		}
		  
	  } 
	  
      public static void main(String[] args) {
    	  Ejercicio22 fc = new Ejercicio22();
    	  fc.entradaño();
    	  fc.proceso();
	
	
   }

	public void proceso() {
		
		
	}

	}