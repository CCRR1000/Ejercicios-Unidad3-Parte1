/* 
   13. Diseñar un algoritmo que calcule el volumen de un cilindro dados su radio y altura 
   (primero el programa deberá verificar si son positivas).
*/

import java.util.*;

public class Ejercicio13 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int r, h;
		double V;

		System.out.print("\nIngrese el radio: ");
		r = read.nextInt();
		System.out.print("Ingrese la altura: ");
		h = read.nextInt();

		if (r>0 && h>0) {

			V = Math.PI *r*r*h;
			System.out.println("\nVolumen: "+V+"\n");
			
		} else {
			System.out.println("\nDebe ingresar numeros positivos\n");
		}
	}


}

