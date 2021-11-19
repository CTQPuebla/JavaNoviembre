package com;

import java.util.Scanner;

public class EjerciciosdeArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, numeros = 0, numeros2 =0;
		
		System.out.println("coloque el numero de posiciones que desea reservar");
		numeros = entrada.nextInt();
		
		int [] array = new int [numeros];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Coloca el valor dentro de la posicion " + i);
			numeros2 = entrada.nextInt();
			
			if (numeros2 > 0) {
				
				cont1++;
				cont2 += numeros2;
			}
			
			else if(numeros2 < 0){
				
				cont3++;
				cont4 += numeros2;
			}
			
			else {
				cont5++;
			}
			
		}
		
		if(cont1 == 0 && cont3 == 0) {
			
			System.out.println("no se introdujo ningun valor negativo ni positivo");
			
		}
		
		else {
			
			System.out.println("numeros negativos " + cont1 + " numeros positivos " + cont3 + " numeros ceros " + cont5);
			System.out.println("Suma de los numeros positivos " + cont2 + " \nsuma de los numeros negativos " + cont4 + 
							   " \npromedio de positivos " + cont2/cont1 + " promedio de negativos " + cont4/cont3);
		}
		
	}
}