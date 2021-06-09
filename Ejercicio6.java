/*
   6. Diseñar un algoritmo que genere un número aleatorio del 0 al 200, lo muestre y luego calcule
    y muestre el mismo número aumentado en un 30%.
*/
import java.util.*;

public class Ejercicio6 {

	public static void main(String args[]) {
		
		Random random = new Random();

		int numAl;
		double porcentaje;

		numAl = random.nextInt(200+1);
		porcentaje = (1+0.3)*numAl;
		
		System.out.println("\nNumero aleatorio: "+numAl);
		System.out.println("\n"+numAl+" aumentado un 30% es "+porcentaje+"\n");

	}


}

