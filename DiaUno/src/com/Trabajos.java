package com;

public class Trabajos {
	public static void main(String[] args) {
		String nombre = "Nicolas Omar Diego Hernandez 25 19960808";
		String aux;
		String auxNum = "";
		int sumaNum = 0;
		int suma = 0;
		
		for (int i = 0; i < nombre.length(); i++) {
			aux =Character.toString(nombre.charAt(i));
			try {
				suma += Integer.parseInt(aux);
				auxNum += aux;   
				sumaNum++;
			} catch (Exception e) {
				
			}
		}
		System.out.println(auxNum);
		
		int[] numeros = new int[auxNum.length()];
		for (int i = 0; i < auxNum.length(); i++) {
			numeros[i] = Integer.parseInt(Character.toString(auxNum.charAt(i)));
		}
		
		for (int i = 0; i < sumaNum; i++) {
			System.out.println("En la posicion " + i + " esta almacenado el valor: " + numeros[i]);
		}
		
		//System.out.println("Hay " + sumaNum + " numeros");
		//System.out.println("La suma es: " + suma);
		
	}
}
