package com;

public class B {

	public static void main(String[] args) {
		int[] a = { 0, 16, 1, 4, -3, 7, 7, 5, 2, 8, 11 };

		a[2] = a[2] - a[2];
		int test=10;
		
		boolean flag=true;
		while (flag) {
			System.out.println(a[2]);
			a[2] = a[2] + a[test];
			
			if(a[5]>test) {
				
				flag=false;
				break;
			}
			test=test-1;
		}
	}

}
