package com;

import java.util.Scanner;

public class EjercicioArray2 {

	public static void main(String[] args) {
		
		int numeros1 = 0, numeros2 = 0, cont1 = 0, cont2 = 0, cont3 = 0;
		int [] Array, Array1, Array2;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce los espacio que quieres reservar");
		int numeros = entrada.nextInt();
		
// Parte 1 Introducir valores para Array		

		Array = new int[numeros];
		
		for(int i = 0; i < Array.length; i++) {
			
			System.out.println("Coloca el valor en en la posicion " + i);
			numeros1 = entrada.nextInt();
			
			Array[i] = numeros1;
			
			cont1 = Array[i];
			
		}
		
//Parte 2 Introducir valores para Array1 utilizando Array
		
		Array1 = new int[cont1];
		
		for (int i = 0; i < Array.length; i++) {
			
			Array1 [i] = Array[i];
			
			if(Array1[i]%2 == 0) {
				
				cont2++;
			}
			
			cont3 = Array1[i];	
		}
		
		System.out.println("Hay " + cont2 + " Pares");
		
// Parte 3 Introducir valores para Array2 desde Array1 para mostrar los valores
		
		Array2 = new int[cont3];
		
		for (int i = 0; i < Array1.length; i++) {
			
			Array2 [i] = Array1[i]; 
			
			System.out.println("En la posicion " + i + " esta el valor " + Array2[i]);
			
		}
	}
}				