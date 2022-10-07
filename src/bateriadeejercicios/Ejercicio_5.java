package bateriadeejercicios;
import java.util.*;

public class Ejercicio_5 {
	public static void main(String[] args) {
		
		/*/Realizar un programa que lea un número por teclado. En caso de que 
		ese número sea 0 o menor que 0, se saldrá del programa 
		imprimiendo antes un mensaje de error. Si es mayor que 0, se deberá 
		calcular su cuadrado y la raíz cuadrada del mismo, visualizando el 
		número que ha tecleado el usuario y su resultado (“Del número X, su 
		potencia es X y su raíz X”)./*/
		
		Scanner es=new Scanner(System.in);
		Double a;
		System.out.println("Ingrese el valor de a");
		a=es.nextDouble();
		if(a<=0) {
			System.out.println("Programa terminado");
			
		}else {
			System.out.println("Se calculadara la raiz cuadrada y su cuadrado");
			System.out.println("Raiz cuadrada:"+(Math.sqrt(a)));
			System.out.println("El cuadrado es:"+(Math.pow(a, 2)));
		}
		
		es.close();
	}
}