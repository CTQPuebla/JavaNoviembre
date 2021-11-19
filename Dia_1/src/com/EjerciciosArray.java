package com;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosArray {
	
	public static void main(String[] args) {
		
		String numOperador = "", dato = "", operador = "";
		double numero = 0, suma = 0, resta = 0, mult = 1, div = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		Double[] numerosArray = new Double[10];
		
		System.out.println("Que operacion vas a realizar");
		operador = entrada.nextLine();
		
		switch(operador) {
		
			case "+" :
			
				for(int i = 0; i < numerosArray.length ; i++) {
			
					System.out.println("introduce los valores o saca el total");
					numOperador = entrada.nextLine();
			
						if(numOperador.equals("=")) {
				
							System.out.println("La suma total es: " + suma);
							break;
							}
						
						else if(numOperador.contentEquals("x")) {
							
							suma *= numerosArray[i];
							
						}
						
						else if(numOperador.contentEquals("/")) {
							
							suma /= numerosArray[i];
							
						}
						
						else if(numOperador.contentEquals("-")) {
							
							suma -= numerosArray[i];
							
						}
							
						else{ 
							
							numero = Double.parseDouble(numOperador);
							numerosArray[i] = numero;
							suma += numerosArray[i];
						}		
					}
				
				break;
			
			case "-":
			
				for(int i = 0; i < numerosArray.length ; i++) {
					
					System.out.println("resta los valores o saca el total");
					numOperador = entrada.nextLine();
			
						if(numOperador.equals("=")) {
				
							System.out.println("La suma total es: " + resta);
							break;
							}
			
						else{ 
							
							numero = Double.parseDouble(numOperador);
							numerosArray[i] = numero;
							resta = numerosArray[i] - resta;
						}		
					}
				
				break;
			}
		}
	}	