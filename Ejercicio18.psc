Algoritmo Ejercicio18
	
	Definir num, d1, d2, d3, d4 como Entero
	Leer num
	
	Si num<10 Entonces
		d4 <- ConvertirANumero(Subcadena(ConvertirATexto(num),1,1))
		
	SiNo
		Si num<100 Entonces
			d3 <- ConvertirANumero(Subcadena(ConvertirATexto(num),1,1))
			d4 <- ConvertirANumero(Subcadena(ConvertirATexto(num),2,2))
			
		SiNo
			Si num<1000 Entonces
				d2 <- ConvertirANumero(Subcadena(ConvertirATexto(num),1,1))
				d3 <- ConvertirANumero(Subcadena(ConvertirATexto(num),2,2))
				d4 <- ConvertirANumero(Subcadena(ConvertirATexto(num),3,3))
				
			SiNo
				Si num<10000 Entonces
					d1 <- ConvertirANumero(Subcadena(ConvertirATexto(num),1,1))
					d2 <- ConvertirANumero(Subcadena(ConvertirATexto(num),2,2))
					d3 <- ConvertirANumero(Subcadena(ConvertirATexto(num),3,3))
					d4 <- ConvertirANumero(Subcadena(ConvertirATexto(num),4,4))
					
				SiNo
					Escribir "Debe ingresar un número menor o igual a 4 digitos"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	suma <- d1 + d2 + d3 + d4
	
	Escribir "d1=" d1 " d2=" d2 " d3=" d3 " d4=" d4
	Escribir "Suma:" suma
	
FinAlgoritmo
