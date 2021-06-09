/*
   4. Diseñar un algoritmo que imprima el cuadrado y el cubo de un número ingresado por teclado
*/
import java.util.*;

public class Ejercicio4 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int num, cuadrado, cubo;

		System.out.print("\nIngresa un numero: ");
		num = read.nextInt();

		cuadrado = num*num;
		cubo = num*cuadrado;

		System.out.println("\nEl cuadrado de "+num+" es: "+cuadrado);
		System.out.println("El cubo de "+num+" es: "+cubo+"\n");
	}


}

