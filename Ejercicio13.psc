Algoritmo Ejercicio13
	
	Definir r, h como Entero
	Definir V como Real
	
	Escribir "Ingrese el radio:"
	Leer r
	Escribir "Ingrese la altura:"
	Leer h
	
	Si r>0 Y h>0 Entonces
		V <- Pi * r * r * h
		Escribir "Volumen: " V
	SiNo
		Escribir "Debe ingresar números positivos"
	Fin Si
	
FinAlgoritmo
