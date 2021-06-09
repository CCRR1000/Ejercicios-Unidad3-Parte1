/* 
   17. Realice un algoritmo para mostrar un cartel que indique si un triángulo es «escaleno», 
   «equilátero» o «isósceles» ingresando sus lados.
*/

import java.util.*;

public class Ejercicio17 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int a, b, c;

		System.out.print("\nIngrese el primer lado: ");
		a = read.nextInt();
		System.out.print("Ingrese el segundo lado: ");
		b = read.nextInt();
		System.out.print("Ingrese el tercer lado: ");
		c = read.nextInt();

		if (a==b && a==c) {
			System.out.println("\nEl triangulo es EQUILATERO\n");

		} else {

			if (a!=b && a!=c && c!=b) {
				System.out.println("\nEl triangulo es ESCALENO\n");

			} else {
				System.out.println("\nEl triangulo es ISOSCELES\n");
			}

		}
	}


}

