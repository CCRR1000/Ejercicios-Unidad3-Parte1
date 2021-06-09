/* 
   8. Diseñar un algoritmo que, dados tres números enteros, calcule e imprima el promedio entre ellos.
*/

import java.util.*;

public class Ejercicio8 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		double num1, num2, num3, promedio;

		System.out.print("\nPrimer Numero: ");
		num1 = read.nextDouble();
		System.out.print("Segundo Numero: ");
		num2 = read.nextDouble();
		System.out.print("Tercer Numero: ");
		num3 = read.nextDouble();

		promedio = (num1+num2+num3)/3;

		System.out.println("\nEl promedio es: "+promedio+"\n");

	}


}

