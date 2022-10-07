package bateriadeejercicios;
import java.util.*;

public class Ejercicio21 {
	public static void main(String[] args) {
		
		/*/ .Programa que lea un número entero (altura) y a partir de él, cree una 
		escalera invertida de asteriscos con esa altura. Deberá quedar así, si 
		ponemos una altura de 5.
		 	*****
		 	****
		 	***
		 	**
		 	*     /*/
      
        
		Scanner es = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = es.nextInt();
        es.close();
        System.out.println();
        for(int numBlancos = 0, numAsteriscos = (numFilas*2)-1; numAsteriscos>0; numBlancos++, numAsteriscos -= 1){
            
       
            for(int i=0; i < numBlancos; i++){
                System.out.print(" ");
            }
            
   
            for(int j=numAsteriscos; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
