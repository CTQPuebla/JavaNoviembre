package com;

public class Practica_2 {
	
	public static void main (String[] args) {
		
/*		int dia = 8;
		
		if(dia == 1) {
			System.out.println("Lunes");
		}
		
		else if (dia == 2) {
			System.out.println("Martes");
		}
		
		else if (dia == 3) {	
			System.out.println("Miercoles");
		}
		
		else if (dia == 4) {
			System.out.println("Jueves");
		}
		
		else if (dia == 5) {
			System.out.println("Viernes");
		}
	
		else {
			System.out.println("Ingresa un valor valido");
		}
*/		
/*		String dia = "";
		
		switch(dia) {
			
		case "uno":
			System.out.println("Lunes");
			break;
			
		case "dos":
			System.out.println("Martes");
			break;
			
		case "tres":
			System.out.println("Miercoles");
			break;
			
		case "cuatro":
			System.out.println("Jueves");
			break;
			
		case "cinco":
			System.out.println("Viernes");
			break;
			
			default:
				System.out.println("Ingresa un valor valido");
			
		}*/
	
/*		double salario = 17098.60;
		
		if(salario>0 && salario <= 9000) {
			System.out.println("Nuevo salario " + (salario + (salario*0.20)));
			}
		
		else if (salario >= 9001 && salario<=15000) {
			System.out.println("Nuevo salario " + (salario + (salario*0.10)));
		}
		
		else if (salario >= 15001 && salario<=20000) {
			System.out.println("Nuevo salario " + (salario + (salario*0.05)));
		}
		
		else if (salario >= 20001) {
			System.out.println("Nuevo salario " + (salario + (salario*0.03)));
		}
*/
		
/*		String k = "hola";
		int o = 10;
		
		if((k.equals("hola") || o == 11)) {
			
			System.out.println("si se cumple");
		}
		
		else {
			
			System.out.println("No se cumple");
		}
*/
		
	/*	for(int i = 0; i < 10; i++) {
			
			System.out.println("7 x " + (i+1) + " = " + 7*(i+1) );
				
		}*/
		
//		int [] mi_matriz = new int[5];
		
/*		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
*/
		int [] mi_matriz = {15, 38, 15, 92, 71, 95, 85, 65, 25, 14, 78, 85, 65, 12};
		
		for(int i = 0; i<mi_matriz.length; i++) {
			
			System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
		}
	}
}
