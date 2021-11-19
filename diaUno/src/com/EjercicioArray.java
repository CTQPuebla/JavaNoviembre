package com;

import java.util.Scanner;

public class EjercicioArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int[][] n = { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] nn = new int[2][3];
		int[][] n = new int[2][3];
		int[][] r = new int[2][3];
		
		// iterar sibre 2 dimenciones
		for (int i = 0; i < nn.length; i++) {
			for (int j = 0; j < nn[1].length; j++) {
				System.out.println("Ingresa un numero");
				nn[i][j] = sc.nextInt();

			}

		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[1].length; j++) {
				System.out.println("Ingresa un numero");
				n[i][j] = sc.nextInt();

			}

		}

		for (int i = 0; i < nn.length; i++) {
			System.out.println();
			for (int j = 0; j < nn[1].length; j++) {
				r[i][j] = nn[i][j] + n[i][j];

			}
		}
		
		for (int i = 0; i < nn.length; i++) {
			for (int j = 0; j < nn[i].length; j++) {
				System.out.println("suma es " + r[i][j]);
			}
		}

	}
}
