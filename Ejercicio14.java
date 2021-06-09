/* 
   14. Crear un algoritmo que calcule si dos números son divisibles. Para ello, se piden un primer número y un 
   segundo numero, entonces mostrar un cartel que diga -es divisible- si el segundo número es divisible al primero.
*/

import java.util.*;

public class Ejercicio14 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int num1, num2;

		System.out.print("\nIngrese el primer numero: ");
		num1 = read.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = read.nextInt();

		if (num1%num2==0) {

			System.out.println("\n"+num1+" es divisible entre "+num2+"\n");

		} else {

			System.out.println("\n"+num1+" no es divisible entre "+num2+"\n");

		}
	}


}

