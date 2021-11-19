package com;

import java.util.Scanner;

public class PracticaUno {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		
		/*System.out.println("08 de noviembre");
		String m="hola";
		System.out.println(m);
		   int j=1;
		   
		   if(j==10 && m.equals("hola")) {
			   System.out.println("el valor de j es igual a 10 y es mayor que 6");
			   
			   
		   }else
		   {
			   System.out.println("el valor de j es diferente de 10 y menor que 6");
		   }
		  
		int dia =8;
		if(dia==1) {
			System.out.println("lunes");
		}else if(dia==2)
		{
			System.out.println("martes");
		}else if(dia==3) {
			System.out.println("miercoles");
		}else if(dia==4){
			System.out.println("jueves");
			
		}else if(dia==5) {
			System.out.println("viernes");
			
		}else {
			
			System.out.println("ingrese un valor valido");
		}
		
		
		
		
		
		
		switch(dia) {
		case 1:
			System.out.println("es lunes");
			break;
		case 2:
			System.out.println("es martes");
			break;
		case 3:
			System.out.println("es miercoles");
			break;
		case 4:
			System.out.println("jueves");
		break;
		case 5:
			System.out.println("es viernes");
			default:
		System.out.println("ingrese un valor valido");
			
		}
		
		double salario=9200.60;
		
		if(salario>0 && salario<=9000) {
			System.out.println("nuevo salario: "  +  ( salario + salario * 0.20));
		}else if(salario>=9001 && salario <=15000) {
			System.out.println("nuevo salario"+ (salario+salario*0.10));
		}else if(salario>=15001 && salario <=20000) {
		System.out.println("nuevo salario"+ (salario+salario*0.05));
	    }else if(salario>=20001) {
		System.out.println("nuevo salario"+ (salario+salario*0.03));
	}
		
		String k="hola";
		int o=0;
		if(k.equals("hola") && 0==11)
		{
			System.out.println("si se cumple");
		}else {
			System.out.println("no se cumple");
			}
			
		    
		  
		  
	
	
			int numero1,numero2;
			System.out.println("inserte el numero1");
			numero1=entrada.nextInt();
			System.out.println("inserte el numero2");
			numero2=entrada.nextInt();
			if(numero1>numero2) {
				System.out.println("el numero 1 es mayor que el numero 2");
			}else
			{
				System.out.println("el numero 2 es mayor que el numero 1");
			}
		
			
		   int tipopago;
		   double total,des,recargo;
		   System.out.println("Forma de pago");
		   System.out.println("1.-Contado");
		   System.out.println("2.-Tarjeta");
		   tipopago=entrada.nextInt();
		   
		   if(tipopago==1) {
			   System.out.println("ingresar el total de la compra");
			   total=entrada.nextInt();
			    des=total*0.05;
				System.out.println("total descuento: "+ des);
				System.out.println("total a pagar"+(total-des));
			   
		   }else {
			   if(tipopago==2) {
			   System.out.println("ingresar el total de la compra");
			   total=entrada.nextInt();
			    recargo=total*0.03;
				System.out.println("total recargo "+ recargo);
				System.out.println("total a pagar"+(total+recargo));
			   }
			   else
			   {
				   System.out.println("ingrese un valor valido");
			   }
		   }
		
		   
		   double monto,des;
		   String dia;
		   System.out.println("ingresar el dia de la compra");
		   dia=entrada.nextLine();
		   switch(dia) {
		   case "lunes":
			   System.out.println("ingresar el monto de la compra");
			    monto=entrada.nextInt();
			    System.out.println("el dia de hoy no hay descuento"+ monto);
			    break;
		   
		   case "martes":
			   System.out.println("ingresar el monto de la compra");
			    monto=entrada.nextInt();
			    des=monto*0.15;
				System.out.println("total descuento: "+des );
				System.out.println("total a pagar"+(monto-des));
				break;
		   case "jueves":
			   System.out.println("ingresar el total de la compra");
			    monto=entrada.nextInt();
			    des=monto*0.15;
				System.out.println("total recargo "+ des);
				System.out.println("total a pagar"+(monto- des));
			
				default:
					System.out.println("error");
		   }
	int	contador=0;
	int o=10;
	for(int i=15; i>=o; i--) {
		System.out.println("mensaje" + i);
		
	}
	
		int numero;
		System.out.println("ingrese un numero");
		numero=entrada.nextInt();
		for(int i=1; i<=numero; i++) {
			
			System.out.println("numero" + numero);
		}
		int p=10;
		int contador=0;
		String cadena;
		while(contador<p ) {
			System.out.println("ingrese una letra");
			cadena=entrada.nextLine();
			if(cadena.equals(cadena.toUpperCase())) {
				System.out.println("si es igual" + cadena);
			}
			contador++;
		}*/
		
		
		String texto = "";

		System.out.println("Ingresa un texto");
		texto = entrada.nextLine();
        int valor=0;
		
		
		for (int i = 0; i < texto.length(); i++) {
	    System.out.println("Caracter actual: " + texto.charAt(i));
	    String aux = Character.toString(texto.charAt(i));

//		String jj = "Cesar J 26 987654320";
//		
//		//Tamaño de un string - .length()
//		System.out.println("Tamaño: "+jj.length());
//		
//		//Pedirle un caracter individual a un string basado en su posicion
//		System.out.println("Caracter: "+jj.charAt(1));


			// Cachar el caracter actual y convertirlo de nuevo a String
			//                       "m"                'm'
			
			
			
			
			//Verifico si de verdad ya es un valor numerico, haciendo una operacion aritmetica
			System.out.println(valor+1);
			
			
			//Manejo del error
			try {
				//Intenta hacer esto ...				
				//Convierte un string a un entero
				valor = Integer.parseInt(aux);
				System.out.println("Si es un numero");
			}catch(Exception e) {
				//Si no puedes, informa el error
				//e.getMessage();
				System.out.println(aux + " no es un numero");
			}finally {
				//Se ejecutara por default, 
				System.out.println("Accion por default");
			}
			//Comparacion multiple con ifs y operador OR
//			if(aux.equals("1")||
//			   aux.equals("2")||
//			   aux.equals("3")||
//			   aux.equals("4")||
//			   aux.equals("5")||
//			   aux.equals("6")||
//			   aux.equals("7")||
//			   aux.equals("8")||
//			   aux.equals("9")||
//			   aux.equals("0")) {
//				System.out.println("El caracter actual "+ aux + " si es un numero");
//			}
			
			//Comparacion multiple con switch
//			switch (aux) {
//
//			case "a":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "e":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "i":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "o":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "u":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//
//			}
			
			//Me impriman la sumatoria de los numeros y cuantos numeros hay en el string
		}
		
		   
	}
	

}
