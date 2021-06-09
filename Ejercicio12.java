/* 
   12. Diseñar un algoritmo que convierta y muestre la temperatura en Fahrenheit ingresando la temperatura en Celsius.
*/

import java.util.*;

public class Ejercicio12 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		double temperatura, farenheit;
		
		System.out.print("\nIngrese una temperatura: ");
		temperatura = read.nextDouble();
		
		farenheit = (temperatura*9/5)+32;
		
		System.out.println("\n"+temperatura+"°C = "+farenheit+"°F\n");
	}


}

