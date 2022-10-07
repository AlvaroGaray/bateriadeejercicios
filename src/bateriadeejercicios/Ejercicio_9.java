package bateriadeejercicios;
import java.util.*;

public class Ejercicio_9 {
    public static void main(String args[]) {
    	
    	/*/ Modificar el programa anterior, de forma que, si se teclea un cero, se 
		vuelva a pedir el número por teclado (así hasta que se teclee un 
		número mayor que cero)/*/
    	
        Scanner es = new Scanner(System.in);
        int a;
        do{System.out.println("Digite un numero");
        a=es.nextInt();}while(a<=0);
        if(a % 2 == 2) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        
        es.close();
    }

}