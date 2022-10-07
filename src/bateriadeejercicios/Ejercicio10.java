package bateriadeejercicios;
import java.util.*;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		/*/.Programa que nos diga si una persona puede acceder a cursar un 
		ciclo formativo de grado superior o no. Para acceder a un grado 
		superior, si se tiene un título de bachiller, en caso de no tenerlo, se 
		puede acceder si hemos superado una prueba de acceso
		(admisión).  /*/
		
		Scanner es=new Scanner(System.in);
		String SioNo="Si";
		System.out.println("Usted quiere cursar un ciclo formativo de grado mayor");
		System.out.println("Posee titulo de bachiller?");
		SioNo=es.next();
		if(SioNo.equalsIgnoreCase("No")) {
			System.out.println("Usted paso el examen de admision?");
			SioNo=es.next();
			if(SioNo.equalsIgnoreCase("No")) {
				System.out.println("Lo sentimos, usted no puede cursar un ciclo formativo de grado mayor");
				System.exit(0);
			}else {
				System.out.println("Usted puede cursar un ciclo formativo de grado mayor");
			}
		}else {
			System.out.println("Usted puede cursar un ciclo formativo de grado mayor");
		}
		
		es.close();
	}
}