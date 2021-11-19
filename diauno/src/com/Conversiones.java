package com;

import java.util.Scanner;

//Determinado si son numeros par en array///
public class Conversiones {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		numeros[0] = 10;
		numeros[1] = 9;
		numeros[2] = 8;
		numeros[3] = 7;
		numeros[4] = 6;
		numeros[5] = 5;
		numeros[6] = 4;
		numeros[7] = 3;
		numeros[8] = 2;
		numeros[9] = 1;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce un numero");
			numeros[i] = sc.nextInt();

			if (numeros[i] % 2 == 0) {
				System.out.println("Si es par");

				int sumatoria = 0;
				sumatoria = sumatoria + numeros[i];
			}

		}

	}

}
