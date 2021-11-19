package com;

import java.util.Scanner;

public class EjeciciosArrayBidimensionales {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [][] Array1, Array2, Array3;
		
		int numeros1 = 0, numeros2 = 0, numeros3 = 0, numeros4 = 0, numeros5 = 0, numeros6 = 0, almacenados1 = 0, almacenados2 = 0, total = 0;
		int cont1 = 0, cont2 = 0; 
		
// Parte 1 insertando los numeros para los espacios a reservar 		
		
		System.out.println("Inserta el numero de espacio que quieres reservar para el primer arreglo de la posicion 1X");
		numeros1 = entrada.nextInt();
		
		System.out.println("Inserta el numero de espacio que quieres reservar para el primer arreglo de la posicion 1Y");
		numeros2 = entrada.nextInt();
		
		Array1 = new int [numeros1][numeros2];
		
		for (int i = 0; i < Array1.length; i++) {
			
			for (int j = 0; j < Array1[i].length; j++) {
				
				System.out.println("Inserta los valores en los espacios reservados en la posicion " + i + j);
				almacenados1 = entrada.nextInt(); 
				
				Array1 [i][j] = almacenados1;
				
				cont1 = Array1[i][j];
				
			}
		}
		
		System.out.println("Inserta el numero de espacio que quieres reservar para el segundo arreglo de la posicion 2X");
		numeros3 = entrada.nextInt();
		
		System.out.println("Inserta el numero de espacio que quieres reservar para el segundo arreglo de la posicion 2Y");
		numeros4 = entrada.nextInt();
		
		Array2 = new int [numeros3][numeros4];

		for (int i = 0; i < Array2.length; i++) {
			
			for (int j = 0; j < Array2[i].length; j++) {
				
				System.out.println("Inserta los valores en los espacios reservados en la posicion " + i + j);
				almacenados2 = entrada.nextInt();
				
				Array2 [i][j] = almacenados2;
				
				cont2 = Array2[i][j];
				
			}
		
		}
		
		Array3 = new int [cont1][cont2];
				
		for (int i = 0; i < Array1.length; i++) {
			
			for (int j = 0; j < Array2[i].length; j++) {
				
				total = Array1[i][j] + Array2[i][j];
				
				Array3 [i][j] = total;
				
				System.out.println("\nEn la posicion " + i + " " + j + " Este el resultado " + Array3[i][j]);
			}	
		}
	}
}

