package bateriadeejercicios;
import java.util.*;

public class Ejercicio_4 {
	public static void main(String[] args) {
		
		/*/Diseñar un programa que pida por teclado tres números; si el 
		primero es negativo, debe imprimir el producto de los tres y si no lo 
		es, imprimirá la suma. /*/
		
		Scanner es=new Scanner(System.in);
		int a, b, c;
		System.out.println("Ingrese el valor de a");
		a=es.nextInt();
		System.out.println("Ingrese el valor de b");
		b=es.nextInt();
		System.out.println("Ingrese el valor de c");
		c=es.nextInt();
		
		if(a<0) {
			System.out.println("Se realizara una multiplicacion, el resultado es"+(a*b*c));
		}else {
			System.out.println("Se realizara una suma, el resultado es:"+(a+b+c));
		}
		
		es.close();
	}
}
