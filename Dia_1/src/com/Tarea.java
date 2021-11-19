package com;

public class Tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Hele 91^02r38";
		String aux2 = "";
		int auxNum;
		for (int i = 0; i < texto.length(); i++) {
			
			try {
				auxNum = Integer.parseInt(Character.toString(texto.charAt(i)));
				aux2 = aux2 + auxNum;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		int [] array = new int[aux2.length()];
		
		for (int i = 0; i < aux2.length(); i++) {
			
			array[i] = Integer.parseInt(Character.toString(aux2.charAt(i))); 
			System.out.println("La posicion " + i + " el numero es " + array[i]);
		}

		
//		System.out.println(aux2);
		
		
	}

}
