package bateriadeejercicios;
import java.util.*;

public class Ejercicio_7 {
	public static void main(String[] args) {
		
		/*/Una tienda ofrece un descuento del 15% sobre el total de la compra 
		durante el mes de febrero. Dado un mes y un importe (monto), 
		calcular cuál es la cantidad que se debe cobrar al cliente. /*/
		
		Scanner es=new Scanner(System.in);

		double compra, descuento, monto;
		int mes;
		
		System.out.println("En el mes de Febrero la tienda ofrece un Descuento");
		System.out.println("Seguimos en el mes Febrero?  1.SI/ 2.NO");
		mes=es.nextInt();
		System.out.println("Ingrese el Total de su compra");
		compra=es.nextDouble();
		
		if(mes==1) {
			
			descuento=compra*0.15;
			monto=compra-descuento;
			
			System.out.println("Su descuento es de: "+descuento);
			System.out.println("Su monto a pagar es:"+monto);
			System.out.println("GRACIAS POR SU COMPRA");
		}else {
			monto=compra;
			System.out.println("Su monto a pagar es:"+monto);
			System.out.println("GRACIAS POR SU COMPRA");
		}
	
		es.close();
		
	}		
}