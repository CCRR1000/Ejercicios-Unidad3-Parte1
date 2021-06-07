Algoritmo Ejercicio20
	
	Definir num Como Entero
	
	Escribir "Ingrese un número de 5 dígitos:"
	Leer num
	
	Si num<100000 Y num>0 Entonces
		
		numTxt <- ConvertirATexto(num)
		
		d1 <- Subcadena(numTxt,1,1)
		d2 <- Subcadena(numTxt,2,2)
		d4 <- Subcadena(numTxt,4,4)
		d5 <- Subcadena(numTxt,5,5)
		
		Si d1=d5 Y d2=d4 Entonces
			Escribir "Es Capicúa"
		SiNo
			Escribir "No es Capicúa"
		FinSi
		
	FinSi
	
FinAlgoritmo
