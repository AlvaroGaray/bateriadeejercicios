package bateriadeejercicios;
import java.util.*;
public class Ejercicio23 {
	public static void main(String[] args) {
		
		/*/ .El siguiente es el menú de un restaurante de bocadillos. Diseñar un 
		programa capaz de leer el número de unidades consumidas de cada 
		alimento ordenado y calcular la cuenta total. /*/
			Scanner es = new Scanner(System.in);
			double Bocadillodejamon=1.5;
			 double Refresco=1.05 ;
			 double Cerveza=0.75;
			 

				System.out.println("Menu del restaurante");
				
				System.out.println("Ingrese la cantidad de Boacadillos de jamón :");
				Bocadillodejamon=es.nextDouble();
				System.out.println("Ingrese la catidad de Refrescos :");
				Refresco=es.nextDouble();
				System.out.println("Ingrese la cantidad de cerveza :");
				Cerveza=es.nextDouble();
			
			
			double TotalDeLacuenta = Bocadillodejamon*1.5 + Refresco * 1.05 + Cerveza * 0.75;
   
			System.out.println("El total de la cuenta es :" + TotalDeLacuenta);
		
			es.close();
	}

}