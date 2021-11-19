package com;

public class ArrayTridimencional {
	public static void main(String[] args){
		
		int [][] matrix=new int[4][5];
		
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[0][3]=4;
		matrix[0][4]=5;
		
		matrix[1][0]=10;
		matrix[1][1]=9;
		matrix[1][2]=8;
		matrix[1][3]=7;
		matrix[1][4]=6;
		
		matrix[2][1]=15;
		matrix[2][2]=14;
		matrix[2][3]=13;
		matrix[2][3]=12;
		matrix[2][4]=11;
		
		matrix[3][0]=15;
		matrix[3][1]=16;
		matrix[3][2]=17;
		matrix[3][3]=18;
		matrix[3][4]=19;
		
		System.out.println("valor almacenado en la posicion " + matrix[2][0]);
		
	}

}
