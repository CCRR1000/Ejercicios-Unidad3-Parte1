/*
   5. Diseñar un algoritmo que pida un número por teclado y luego imprima el número siguiente al ingresado.
*/
import java.util.*;

public class Ejercicio5 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int num;

		System.out.print("\nIngrese un numero: ");
		num = read.nextInt();

		System.out.println("\nEl numero siguiente es: "+(num+1)+"\n");
	}


}

