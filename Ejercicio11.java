/* 
   11. Crear un algoritmo que convierta y muestre un valor ingresado en centímetros a yardas, metros, pies y pulgadas.
*/

import java.util.*;

public class Ejercicio11 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		double num;
		double yardas, metros, pies, pulgadas;
		

		System.out.print("\nIngrese un numero: ");
		num = read.nextInt();

		yardas = num/91.44;
		metros = num/100;
		pies = num/30.48;
		pulgadas = num/2.54;

		System.out.println("\n"+num+" cm es igual a: ");
		System.out.println("\nYardas: "+yardas);
		System.out.println("Metros: "+metros);
		System.out.println("Pies: "+pies);
		System.out.println("Pulgadas: "+pulgadas+"\n");
	}


}

