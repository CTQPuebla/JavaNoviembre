package com;

public class MatrizEjemplo {
	
	public static void main(String[] args) {
		
		Object[][] a = {{1, "r", 3, 4},
						{"c", "y", 3, 4},
						{1, 2, 'H', "d"},
						{false, 2, "b", 4}};
		
		Object[][] b = {{4, 3, 2, "p"},
						{4, "$", 2, 1},
						{"!", 3, true, 1},
						{4, 'D', 2, "/"}};
		
		Object[][] c = new Object[4][4];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {										
//				try {
//					c[i][j] = Integer.parseInt(a[i][j].toString()) + Integer.parseInt(b[i][j].toString());			
//				} catch (Exception e) {
//					c[i][j] = "0";
//				}
				
				if (a[i][j] instanceof Integer && b[i][j] instanceof Integer) 
					c[i][j] = (int)a[i][j] + (int)b[i][j];
				else
					c[i][j] = 0;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("En la posicion " + i + " - " + j + " la suma es igual a: " + c[i][j]); 
			}
		}
	}
}
