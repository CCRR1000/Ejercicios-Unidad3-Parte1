/*
   10. Diseñar un algoritmo que imprima el área y el perímetro de un rectángulo ingresando su base y altura.
*/

import java.util.*;

public class Ejercicio10 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int base, altura, area, perimetro;

		System.out.print("\nBase: ");
		base = read.nextInt();
		System.out.print("Altura: ");
		altura = read.nextInt();

		area = base*altura;
		perimetro = 2*(base+altura);

		System.out.println("\nArea: "+area);
		System.out.println("Perimetro: "+perimetro+"\n");
	}


}

