package com;

public class Arrays_1 {

	public static void main(String[] args) {
		
		String oracion = "hele 990105";
		int cont = 0;
		
		for(int i = 0; i < oracion.length(); i++) {
			
			System.out.println("El caracter: " + oracion.charAt(i));
			
			String a = Character.toString(oracion.charAt(i));
			
			if(a.matches("[a-z]")) {
		
			}
			
			else {
				
				try {
					
					int valor = Integer.parseInt(a);
					cont++;
				}
				
				catch (Exception e) {
						
				}
				
			}
			
		}
		
		String t = "";
		
		int[] array = new int[cont];
		
		for(int j =0; j<oracion.length(); j++) {
			
			t = Character.toString(oracion.charAt(j));
			
			if(t.matches("[a-z?]")) {
				
			}
			
		}
		
//	        int [] Array = new int [10];
//	        
//	        Array[0] = 23;
//	        Array[0] = 2;
//	        Array[1] = 3;
//	        Array[1] = 32;
//	        Array[2] = 26;
//	        Array[0] = 76;
//	        
//	        for (int i = 0; i<5; i++) {
//	        	
//	        	System.out.println("posicion " + i + " valor " + Array[i]);
//	        }
//	  
//	}
		
	}
}
