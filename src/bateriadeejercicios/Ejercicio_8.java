package bateriadeejercicios;
import java.util.*;

public class Ejercicio_8 {
    public static void main(String args[]) {
    	
    	/*/ Realizar un programa que, dado un número entero, visualice en 
		pantalla si es par o impar. En el caso de ser 0, debe visualizar “el 
		número no es par ni impar”./*/
    	
        Scanner es = new Scanner(System.in);
     
        System.out.println("Digite un numero");
        int a=es.nextInt();
        if(a==0) {
        	System.out.println("No es par, ni impar");
        }else if(a%2 == 1) {
            System.out.println("Es impar");
        } else {
            System.out.println("Es par");
        }
        
        es.close();
    }
}