package bateriadeejercicios;
import java.util.*;

public class Ejercicio_3 {
	
	/*/Programa que lea tres números distintos y nos diga cuál de ellos es 
	el mayor /*/
	
	public static void main(String[] args) {
		Scanner es=new Scanner(System.in);
		int a, b, c;
		do{System.out.println("Ingrese el valor de a");
		a=es.nextInt();}while(a<0);
		do{System.out.println("Ingrese el valor de b");
		b=es.nextInt();}while(b<0);
		do{System.out.println("Ingrese el valor de c");
		c=es.nextInt();}while(c<0);
		
		if(b>a && b>c) {
			System.out.println("B es el mayor de todos");
			System.out.println(b);
			
		}else if(a>b && a>c) {
			System.out.println("A es el mayor de todos");
			System.out.println(a);

		}else if(c>a && c>b) {
			System.out.println("C es el mayor de todos");
			System.out.println(c);
			
			es.close();

		}
	}
}