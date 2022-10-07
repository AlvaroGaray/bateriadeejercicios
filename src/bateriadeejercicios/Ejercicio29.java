package bateriadeejercicios;
import java.util.*;

public class Ejercicio29 {
	/*/.Dados 3 números, determinar si la suma de dos de ellos es igual al 
	tercero. Si se cumple, escribir “iguales”, si no, escribir “distintos”. /*/

	public static void main(String[] args) {
		
		Scanner es = new Scanner(System.in);
	int  num1,num2,num3;

	
	System.out.println("Dime el numero 1:");
	num1=es.nextInt();
	
	System.out.println("Dime el numero 2:");
	num2=es.nextInt();
	
	
	
	
	if(num1<=num2 & num1>=num2) {

	    num3=num1+num2;
		System.out.println("Iguales");
		
	}else {
		System.out.println("Distintos");
	}

	

	}

}
