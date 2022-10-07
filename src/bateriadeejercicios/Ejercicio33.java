package bateriadeejercicios;


import java.util.*;

public class Ejercicio33 {
		/*/El colegio “Mi Casita” desea calcular el monto a pagar por 
		inscripción del nuevo año escolar, para las familias con hijos en el 
		colegio. Para ello se conoce el número de hijos que tiene la familia 
		en el colegio, el monto de matrícula por niño, el monto de la 
		mensualidad del mes de septiembre por niño y el monto de la 
		sociedad de padres. /*/
	public static void main(String[] args) {
		
		Scanner es = new Scanner(System.in);
		
		System.out.println("....Si quiere detener el programa preisone 4 veces 0....");
		
		double montomensualidad,montomatricula,montosociedadPadres,Totalapagar;
		int hijos = 0;
		
		
		System.out.println("------Colegio Mi casita-----");
		do {
		System.out.println("Ingrese el total de hijos por cada familia :");
		hijos=es.nextInt();
		
		
		System.out.println("Ingrese el monto de la matricula a pagar :");
		montomatricula=es.nextDouble();
		
		System.out.println("Ingrese el monto de la mensualidad  de septiembre a pagar :");
		montomensualidad=es.nextDouble();
		
		System.out.println("Ingrese el monto de la socidad de padres a pagar :");
		montosociedadPadres=es.nextDouble();
		
		Totalapagar=hijos+hijos*montomatricula*hijos+montomensualidad*hijos+montosociedadPadres*1;
		
		System.out.println("EL total a pagar para el colegio Mi casita es de C$:" + Totalapagar);
		
		if(hijos==2) {
			hijos -= (hijos*0.10);
			System.out.println("Se le otorgara un descuento del 10% ");
		
			
		}
		
		if(hijos==3) {
			hijos -= (hijos*0.15);
			System.out.println("Se le otorgara un descuento del 15% ");
			
			
		}
		
		if(hijos>3) {
			hijos -= (hijos*0.20);
			System.out.println("Se le otorgara un descuento del 20% ");
			
		
			
		}
          }while(hijos!=0);
		
		System.out.println("Fin del programa");
		  
		}
		
	   
	}	
	

