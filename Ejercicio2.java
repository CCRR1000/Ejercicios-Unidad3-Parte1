/*
  2. Realice un algoritmo que solicite dos datos: país y capital. Y luego muestre la capital del país. 
  El cartel debe ser como lo indica el siguiente ejemplo: Katmandu es la capital de Nepal.
*/
import java.util.*;

public class Ejercicio2 {

	public static void main(String args[]) {
		
		Scanner read = new Scanner(System.in);

		String capital, pais;

		System.out.print("\nPais: ");
		pais = read.nextLine();
		System.out.print("Capital: ");
		capital = read.nextLine();

		System.out.println("\n"+capital+" es la capital de "+pais+"\n ");
	}


}

