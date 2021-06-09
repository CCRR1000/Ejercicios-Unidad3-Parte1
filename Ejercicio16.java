/* 
   16. Ingresar tres números y mostrar el mayor (asuma que todos son distintos entre sí).
*/

import java.util.*;

public class Ejercicio16 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("\nIngrese el primer numero: ");
		num1 = read.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = read.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		num3 = read.nextInt();

		if (num1>num2 && num1>num3) {
			System.out.println("\nEl numero mayor es "+num1+"\n");

		} else {

			if (num2>num3) {
				System.out.println("\nEl numero mayor es "+num2+"\n");
			} else {
				System.out.println("\nEl numero mayor es "+num3+"\n");
			}

		}
	}


}

