import java.util.*;

public class Ejercicio1 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int num1;
		int num2;
		int suma;

		System.out.print("\nPrimer numero: ");
		num1 = read.nextInt();
		System.out.print("Segundo numero: ");
		num2 = read.nextInt();

		suma = num1+num2;

		System.out.println("\nLa suma de "+num1+" y "+num2+" es:  "+suma);
		
	}

}

