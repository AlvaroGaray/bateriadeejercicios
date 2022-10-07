package bateriadeejercicios;
import java.util.*;

public class Ejercicio13{

    public static void main(String args[]) {

        /*
         * /Se pide representar el programa que nos calcule la suma de los
         * N primeros numeros pares. Es decir, si insertamos un 5, nos
         * haga la suma de 6+8+10+12+14 /
         */
        Scanner es = new Scanner(System.in);

        int contador, total, N;
        total = 0;

        System.out.println("Ingrese el Numero ");
        N = es.nextInt();
        contador = 0;
        int limite = N;
        while (contador < limite) {
            if (N % 2 == 0) {
                total = N + total;
                contador++;

            }
            N++;
        }
        System.out.println("La suma es " + total);

        es.close();

    }
}
