package bateriadeejercicios;
import java.util.*;

public class Ejercicio18 {
	
	public static String fecha;

	public static void main(String[] args) {
		/*/.Leer tres números que denoten una fecha (día, mes, año). 
		Comprobar que es una fecha válida. Si no es válida escribir un 
		mensaje de error. Si es válida escribir la fecha cambiando el número 
		del mes por su nombre. Ej. Si se introduce 1 2 2021, se deberá 
		imprimir “1 de febrero de 2021”. El año debe ser mayor que 0. /*/
		
		    Scanner es = new Scanner(System.in); 
			int dia,mes,año;
			System.out.println("Introduzca el primer numero :");
			dia=es.nextInt();
			
			System.out.println("Introduzca el segundo numero :");
			mes=es.nextInt();
			
			System.out.println("Introduzca el tercer numero :");
			año=es.nextInt();
			
			if((dia>=1) && (dia<=30)) {
				if((mes>=1) && (mes<=12)){
					if(año>0) {
						System.out.println("Fecha correcta");
						System.out.println("1 de febrero de 2021");
						
							
					} 
					
					else{
						System.out.println("Error fecha incorrecta,dia incorrecto");
							
						}
						
						
					}
					
				else {
					System.out.println("Error fecha incorrecta,mes incorrecto");
					
				}

				}
			else {
				System.out.println("Error fecha incorrecta,año incorrecto");
			
		
 	es.close();
			}
			}
	}
					
	
	