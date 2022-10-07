package bateriadeejercicios;
import java.util.*;

public class Ejercicio15{

	public static void main(String[] args) {
			/*/ Teniendo en cuenta que la clave es “tuani”, escribir un programa que 
		nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos 
		los 3 intentos nos mostrará un mensaje indicándonos que hemos 
		agotado esos 3 intentos. Si acertamos la clave, saldremos 
		directamente del programa./*/
		
		 Scanner es = new Scanner(System.in); 
			int veces=0;
			
			String clave="tuani";
			String intento;
			
   do {
			System.out.println("Ingresa la clave");
			intento=es.next();
			if( intento.equals(clave)) {
				System.out.println("Contrasena Correcta");
				System.out.println("Bienvendio usuario ");
				System.out.println("Fin del programa");
				veces=3;
				
			}else {
				System.out.println("Contraseña Incorrecta");
				
				veces = veces+1;
				if(veces ==3) {System.out.println("Lo sentimos ha sido bloquedo del sistema");
				
				}
			}
		
    }while(veces < 3);
		
			es.close();
			
		}
	}
