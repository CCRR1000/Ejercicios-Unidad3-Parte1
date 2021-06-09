/* 
   19. Diseñar un algoritmo que imprima con un cartel «Correcto» según el siguiente caso: si el número N es múltiplo
    de 5 y se encuentra entre los 25 primeros números. N debe ser obtenido aleatoriamente entre números del 1 al 1000.
	Primero debe mostrar N. (utilizar el operador mod que retorna el residuo de la división)
*/

import java.util.*;

public class Ejercicio19 {

	public static void main(String args[]) {
		
		Random random = new Random();

		int n;
		
		n = random.nextInt(1000-1)+1;
		
		System.out.println("\nNumero generado: "+n);
		
		if (n%5==0 && n<=25) {
			System.out.println("\nCorrecto\n");

		} else {
			System.out.println("\nIncorrecto\n");
		}
	}


}

