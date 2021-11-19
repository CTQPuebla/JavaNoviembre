package com;

public class classe2 {
	public static void main(String[] agrs) {
		
		
		//los valores de nuetra String//
		
		
		String num = "fac 13";
		int i;
		int coun = 0;

		for (i = 0; i < num.length(); i++) {
			String m = Character.toString(num.charAt(i));
			System.out.println(m);
			try {
				int n = Integer.parseInt(m);
				coun++;

			} catch (Exception e) {

			}

		}
		
		int[] h = new int[coun];
		int k = 0;
		for (int j = 0; j < num.length(); j++) {
			String m = Character.toString(num.charAt(j));
			System.out.println(m);
			try {
				int n = Integer.parseInt(m);
				h[k]=n;
				k++;

			} catch (Exception e) {

			}

		}
		
	}
}