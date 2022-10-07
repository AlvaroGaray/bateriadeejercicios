package bateriadeejercicios;

public class Ejercicio17 {

	public static void main(String[] args) {
		/*/ Programa que visualice la cuenta de los números que son múltiplos 
		de 2 o de 3 que hay entre 1 y 100./*/
		
		int i =0;
		
		while(i++<=100) {
			System.out.println(i);
			if(i % 2==0) {
				System.out.println("Es multiplo de 2.");
			}
			
		}
		System.out.println("Fin del programa");
		
		

	}

}