package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio20 {

	public static int num;

	public static void main(String[] args) {
		
		/*/ Programa que lea un número entero (lado) y a partir de él, cree un 
		cuadrado de asteriscos con ese tamaño.
		Ejemplo, para lado = 4 escribiría:
		 	****
		 	****
		 	****
		 	**** /*/
		
			Scanner es = new Scanner(System.in);
			System.out.println("Ingrese el numero :");
		   num=es.nextInt();
		
		
		
		
		for (int i = 0; i <num; i++) {
			for (int j = 0; j <num; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
			es.close();
		}
		
		
		

	}

}