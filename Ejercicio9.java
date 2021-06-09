/* 
   9. Diseñe un algoritmo para ingresar dos palabras (A, B) y luego realice el intercambio de sus valores. 
   Finalmente mostrar el contenido de A y de B.
*/

import java.util.*;

public class Ejercicio9 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		String a, b, aux;

		System.out.print("\nEscriba la primer palabra: ");
		a = read.nextLine();
		System.out.print("Escriba la segunda palabra: ");
		b = read.nextLine();

		aux = a;
		a = b;
		b = aux;

		System.out.println("\nEl nuevo orden de las palabras es:");
		System.out.println(a);
		System.out.println(b+"\n");

	}


}

