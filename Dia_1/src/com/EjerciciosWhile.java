package com;

import java.util.Scanner;

public class EjerciciosWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, cont = 1;
		
		System.out.println("Introduce una palabra, oracion o frase:");
		numero = entrada.nextInt();
		
		while(cont <= numero) {
			
			System.out.println("numero " + cont);
			
			  if(cont == 5){
		            break;
		            }
			  
			  cont++;
		}
		
//		do {
//			
//			System.out.println("numero " + numero);
//			numero--;
//		} 
//		
//		while(cont <= numero);
		
//		for (int i = 0; i <= numero; numero--) {
//			
//			System.out.println("numero " + numero);
//			
//		}
		
		
		
		}

	}
