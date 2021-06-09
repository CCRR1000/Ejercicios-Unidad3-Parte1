/* 
   15. Diseñar un algoritmo que indique con carteles si el número ingresado es negativo, positivo o nulo.
*/

import java.util.*;

public class Ejercicio15 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int num;

		System.out.print("\nIngrese un numero: ");
		num = read.nextInt();

		if (num==0) {
			System.out.println("\nEl numero es nulo.\n");

		} else {

			if (num>0) {
				System.out.println("\nEl numero es positivo.\n");
			} else {
				System.out.println("\nEl numero es negativo.\n");
			}

		}
	}


}

