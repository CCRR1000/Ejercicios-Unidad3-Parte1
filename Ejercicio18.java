/* 
   18. Crear un algoritmo que muestre cada uno de los dígitos de un número ingresado por el usuario. El máximo 
   permitido es de 4 dígitos. Al final debe mostrar la suma de los dígitos. Por ejemplo: si se ingresa el número 
   187, entonces debe mostrar en un único cartel lo siguiente: --d1 = 0, d2 = 1, d3 = 8 y d4 =7. suma= 16--. (Utilice 
   la función substr(string, inicio, cantidad)
*/

import java.util.*;

public class Ejercicio18 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int d1=0, d2=0, d3=0, d4=0, num, suma;
		String numTxt;

		System.out.print("\nIngrese un numero de cuatro digitos o menos: ");
		num = read.nextInt();

		numTxt = ""+num;

		if (num<10) {
			d4 = Integer.parseInt(numTxt.substring(0,1));

		} else if (num<100) {
			d3 = Integer.parseInt(numTxt.substring(0,1));
			d4 = Integer.parseInt(numTxt.substring(1,2));

		} else if (num<1000) {
			d2 = Integer.parseInt(numTxt.substring(0,1));
			d3 = Integer.parseInt(numTxt.substring(1,2));
			d4 = Integer.parseInt(numTxt.substring(2,3));

		} else if (num<10000) {
			d1 = Integer.parseInt(numTxt.substring(0,1));
			d2 = Integer.parseInt(numTxt.substring(1,2));
			d3 = Integer.parseInt(numTxt.substring(2,3));
			d4 = Integer.parseInt(numTxt.substring(3,4));

		} else {
			System.out.println("\nDebe ingresar un numero de 4 digitos o menos\n");
		}

		suma = d1+d2+d3+d4;

		System.out.println("\nd1 = "+d1+",  d2 = "+d2+",  d3 = "+d3+",  d4 = "+d4);
		System.out.println("Suma: "+suma+"\n");

	}


}

