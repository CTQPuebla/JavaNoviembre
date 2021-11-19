package com;

import java.util.Scanner;

public class OtraClase {
	public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
	/*

//iniciar un array y declarando el tamaño
	int[] array =new int[15];
	//iniciar un array agregandole valores
	int[] otro= {1,2,3,4,5,6,7,8,9,0};
	
	//llenar un array manualmente
	array[0]=1;
	array[1]=2;
	array[2]=3;
	array[3]=4;
	array[4]=5;
	array[5]=6;
	array[6]=7;
	array[7]=8;
	array[9]=9;
	array[10]=10;
	array[11]=11;
	array[12]=12;
	array[13]=13;
	array[14]=14;
	array[15]=15;
	for(int i=0; i<=array.lenght; i++) {
		//iterar un array y ver su contenido
		
		System.out.println("el valor que tiene la posicion"+array[i]);	
	}

	
	Scanner entrada=new Scanner(System.in);
	String m="";
	System.out.println("ingresa un mensaje");
	m.entrada.nextline();
	
	int numero=0;
	String aux="";
	int ConteoNumerico=0;
	int k=0;
	
	for(int i=0; i<m.length(); i++)
	{
		aux=Character.toString(m.charAt(i));
		try {
			numero=Integer.parseInt(aux);
			ConteoNumerico++;
			//guarda la variable
			//temp=Integer.toString(numero);
			temp=temp+aux;
			k=numero;
		
		}catch(Exception e)
	}
	
	//inicializar el array de 2 dimensiones,darle valores e imprimir los valores*/
	
	String m = "";
	System.out.println("Ingresa un mensaje");
	m = sc.nextLine();

	int numero = 0;
	String aux = "";
	int conteoNumerico = 0;
	int k = 0;
	String temp = "";

	// Itero sobre la totalidad del mensaje
	for (int i = 0; i < m.length(); i++) {
		// Aislo cada caracter individual
		aux = Character.toString(m.charAt(i));

		// Intentar hacer algo ...

		try {
			// "7"
			numero = Integer.parseInt(aux);
			// 7
			conteoNumerico++;
			// Guardar temporalmente en otra variable
			// "7"
			// temp = Integer.toString(numero);
			temp = temp + aux;
			k = numero;

		} catch (Exception e) {
			System.out.println("No es numerico");
		}
	}

	// Esto me indica de que tamaño debo inicializar el array
	System.out.println("Conteo: " + conteoNumerico);
	System.out.println("numero: " + k);
	System.out.println("numeros filtrados: " + temp);

	// Inicializacion del array utilizando el conteo anterior

	int[] valores = new int[conteoNumerico];

	for (int i = 0; i < temp.length(); i++) {
		// Asignarle valores a una posicion especifica del array
		// array[4] = 5;
		// 3 "3" '3'
		valores[i] = Integer.parseInt(Character.toString(temp.charAt(i)));
	}

	for (int i = 0; i < valores.length; i++) {
		System.out.println("Contenido del array en la posicion: " + i + " = " + valores[i]);
	}
}
}


