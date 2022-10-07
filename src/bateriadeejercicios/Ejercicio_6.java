package bateriadeejercicios;
import java.util.*;

public class Ejercicio_6 {
	public static void main(String[] args) {
		
		/*/Un colegio desea saber qué porcentaje de niños y qué porcentaje de 
		niñas hay en el curso actual. Diseñar un programa para este 
		propósito. /*/
		
		Scanner es=new Scanner(System.in);
		int chicos, chicas, total, porcenninos, porcenninas;
		
		System.out.println("Cuantos chicos hay en el salon?");
		chicos=es.nextInt();
		System.out.println("Cuantas chicas hay en el salon?");
		chicas=es.nextInt();
		total=chicos+chicas;
		
		porcenninos=(chicos*100)/total;
		porcenninas=(chicas*100)/total;
		
		System.out.println("El total de Alumnos es:"+total);
		System.out.println("El promedio de Niños es: "+porcenninos+" %");
		System.out.println("El promedio de Niñas es: "+porcenninas+" %");

		es.close();
		
	}
}