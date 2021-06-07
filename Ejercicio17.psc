Algoritmo Ejercicio17
	
	
	Definir a como entero
	Definir b como entero
	Definir c como entero
	
	Escribir "Ingrese el primer lado:"
	Leer a
	Escribir "Ingrese el segundo lado:"
	Leer b
	Escribir "Ingrese el tercer lado:"
	Leer c
	
	Si a=b y a=c Entonces
		Escribir "El triángulo es EQUILÁTERO"
	SiNo
		Si a<>b y a<>c y c<>b Entonces
			Escribir "El triángulo es ESCALENO"
		SiNo
			Escribir "El triángulo es ISÓSCELES"
		Fin Si
	Fin Si
	
FinAlgoritmo
