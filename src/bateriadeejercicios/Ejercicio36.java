package bateriadeejercicios;

import java.util.*;
public class Ejercicio36 {

	public static void main(String[] args) {
		//Ejercicio 36
	Scanner es = new Scanner(System.in);

	String empleado;
	double salariobasico,salarioneto;
	int horasTrabajadas,hora=60;
	int semana=7;
	
	
	 
	System.out.println("Digite el nombre del empleado y apellidos:");
	 empleado=es.nextLine();
	
	
	System.out.println("Digite el salario basico :");
	salariobasico=es.nextDouble();
	System.out.println("Digite el salario neto :");
	salarioneto=es.nextDouble();
	System.out.println("Digite el numero de horas trabajadas en la semana :");
	horasTrabajadas=es.nextInt();
	
	salariobasico=salariobasico/hora;
	System.out.println("El salario basico por hora es igual a :" + salariobasico);
	System.out.println("Las horas trabajadas por una semana son : " + horasTrabajadas);
	
	if(horasTrabajadas<48) {
		System.out.println("Su salario neto es :" + salarioneto);
		
	}
	
	else if(horasTrabajadas>48) {
		
		System.out.println("Horas extras de trabajo se le recargara un insumo");
		 salarioneto =salarioneto+horasTrabajadas* 0.35;
		 
		 System.out.println("El salario neto es igual a : "+ salarioneto);
		 System.out.println(""+ empleado);
		
		
	}
	}

}