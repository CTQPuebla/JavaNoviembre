package com;

import java.util.Scanner;

public class Conversiones {

	public static void main(String[] args) {
		int numero = 0;
		int conteo = 0;
		int sumatoria = 0;
		String texto = "";
		String aux = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el texto");
		texto = sc.nextLine();

		for (int k = 0; k < texto.length(); k++) {
			aux = Character.toString(texto.charAt(k)); // aislamos
			try {
				numero = Integer.parseInt(aux);//convierte el string a numero
				conteo++;
				sumatoria = sumatoria + numero;
		} catch(Exception p) {
			//p.getMessage();
			System.out.println(aux + " No es un numero");
		} finally {
			
		}	
		}
		System.out.println("Cantidad de numeros: " + conteo);
		System.out.println("La sumatoria es: " + sumatoria);

	}
	}
