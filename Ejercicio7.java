/*
   7. Diseñar un algoritmo que genere un número aleatorio del 10 al 50, lo muestre y luego calcule 
   y muestre el mismo número disminuido en un 15%.
*/
import java.util.*;

public class Ejercicio7 {

	public static void main(String args[]) {
		
		Random random = new Random();

		int numAl;
		double porcentaje;
		
		numAl = random.nextInt(51-10)+10;
		porcentaje = (1-0.15)*numAl;

		System.out.println("\nNumero aleatorio: "+numAl);
		System.out.println("\n"+numAl+" disminuido un 15% es "+porcentaje+"\n");

	}


}

