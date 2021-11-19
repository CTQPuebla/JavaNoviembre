package com;

import java.util.Scanner;

public class PracticaUno {
	public static void main(String[] args) {

//		System.out.println("8 de noviembre");
//		
//		int n = 10;
//		double nn = 12.8;
//		String m = "juan";
//		if(n==10 && m.equals("jua")){
//				
//				
//			System.out.println("es igual");
//		}else {
//			
//			
//			System.out.println("no es igual");
//		// es esto hace un ciclo repetitivo
		//}
		
		
		
          /// Clase de la tarde como encotra un letra especifica o vocal//////
		Scanner sc = new Scanner(System.in);

		String texto = "";

		System.out.println("Ingresa un unos numero");

		for (int i=0; i < texto.length() i++){

			aux = Character.toString(texto.charAt(i));

			    if (aux.equals("0")||
			    		
					aux.equals("1")||
					aux.equals("2")||
					aux.equals("3")||
					aux.equals("4")||
					aux.equals("5")||
					aux.equals("6")||
					aux.equals("7")||
					aux.equals("8")||
					aux.equals("9")) {
				
				System.out.println(aux+" si es numero");
				

			}else {
				System.out.println(aux+" no es numero");
		    
			}
					
	}
} 


