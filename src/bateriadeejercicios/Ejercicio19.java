package bateriadeejercicios;
import java.util.*;
public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner es = new Scanner(System.in);
		/*/Calcular las calificaciones de un grupo de alumnos. La nota final de 
		cada alumno se calcula según el siguiente criterio: la parte práctica 
		vale el 10%; la parte de problemas vale el 50% y la parte teórica el 
		40%. El programa leerá el nombre del alumno, las tres notas, 
		escribirá el resultado y volverá a pedir los datos del siguiente alumno 
		hasta que el nombre sea una cadena vacía. Las notas deben estar 
		entre 0 y 10, si no lo están, no imprimirá las notas, mostrará un 
		mensaje de error y volverá a pedir otro alumno. /*/
		
		String alumno;
	    double np,npro,nteorica,notaFinal;
	    
	    System.out.println("Escriba el nombre del alumno :");
	    alumno=es.nextLine();
      
      while(!alumno.equals("")) {
    	  System.out.println("Introduzca la nota practica :");
    	  np=es.nextDouble();
    	  System.out.println("Introduzca la nota de problemas :");
    	  npro=es.nextDouble();
    	  System.out.println("Introduzca la nota teorica :");
    	  nteorica=es.nextDouble();
    	  
    	  if((np<=10 &&np>=0 ) && (npro<=10 && npro>=0) && (nteorica<=10 && nteorica>=0)) {
    		  
    		  System.out.println("La nota practica es :" + np);
    		  System.out.println("La nota de problemas es :" + npro);
    		  System.out.println("La nota teorica es :" +  nteorica);
    		  np=np*0.1;
    		  npro=npro*0.5;
    		  nteorica=nteorica*0.4;
    		  notaFinal=np+npro+nteorica;
    		  System.out.println("La nota final es :" + notaFinal);

    	  }else {
    		  System.out.println("....Error has escrito una nota incorrecta....");
    		  System.out.println("Introduce el nombre otro alumno :");
    		  alumno=es.nextLine();
        	  
    		 
    	  }
    	 
    	  }
	  es.close();

	  }
}