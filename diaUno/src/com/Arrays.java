package com;

public class Arrays {

	public static void main(String[] args) {
		// inicializa vacio
		int[] numeros = new int[9];
		int sumatoria = 0;

		// llenado manualmente
		// variable [posicion]= cuanto vale;
		numeros[0] = 11;
		numeros[1] = 37;
		numeros[2] = 2;
		numeros[3] = 56;
		numeros[4] = 52;
		numeros[5] = 8;
		numeros[6] = 485;
		numeros[7] = 14;
		numeros[8] = 785;
		// para imprimir un valor en especifico
//		System.out.println(numeros[5]);

		// recorrer array y que muestre todos sus valores
		// imprimir valores que sea pares
		//Scanner sc=newScanner(System.in);
		//para automatizar
		//for(int i=0;i<numeros.length;i++){
		//syso("ingresa un num")
//		numreros [i] = sc.nextInt();}
//		for int i=0;i<numeros.length;i++){
//			if (numeros[j]%2==0) {
//				System.out.println("si es par");
//			}
//		}
		for (int item : numeros) {
			System.out.println(item);
			if (item % 2 == 0) {
				System.out.println("Es un numero par");
				sumatoria = sumatoria + item;
				System.out.println("la suma es: " + sumatoria);
			} 
			else {
			System.out.println("No es un numero par");
			
		}
			
		}

	}

}

