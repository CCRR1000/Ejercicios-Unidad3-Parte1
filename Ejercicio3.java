/*
  3. Crear un algoritmo que muestre por pantalla el doble y el triple de un número ingresado por teclado.
*/
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String args[]) {
		
		Scanner read = new Scanner(System.in);

		int num, doble, triple;
		
		System.out.print("\nIngresa un numero: ");
		num = read.nextInt();

		doble = num*2;
		triple = num*3;
		
		System.out.println("\nEl doble de "+num+" es: "+doble);
		System.out.println("El triple de "+num+" es: "+triple+"\n");
		
	}

}

