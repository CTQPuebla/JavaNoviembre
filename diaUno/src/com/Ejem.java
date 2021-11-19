package com;

import java.util.Scanner;

public class Ejem {

	public static void main(String[] args) {
		String txt =""; //pasamos valor
		String aux ="";
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa numeros");
		txt = sc.nextLine();
		
		for (int i=0; i < txt.length(); i++) {
			num = Integer.parseInt(txt);
//			if (aux.equals(0)||
//					aux.equals(1)||
//					aux.equals(2)||
//					aux.equals(3)||
//					aux.equals(4)||
//					aux.equals(5)||
//					aux.equals(6)||
//					aux.equals(7)||
//					aux.equals(8)||
//					aux.equals(9)||
//					aux.equals(0)){
//					
//					System.out.println("El caractec actual es: " + num + " si es un numero");
//				} else {
//					System.out.println("El caracter actual es: " + num  +" no es un numero");
//				}
//		
			try {
				num = Integer.parseInt(txt.trim());
				System.out.println("Es numero !!! ");
			} catch (Exception e) {
				// lestras
				System.out.println("No es numero!");
			}
		}

	}

}
