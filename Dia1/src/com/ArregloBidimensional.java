package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

public class ArregloBidimensional {
	public static void main(String agrs[]) {
		/*++++++++++++inicia programa
		Scanner entrada=new Scanner(System.in);
		
		
		
		int[][] array1 = new int[2][3];
		int[][] array2 = new int[2][3];
		int[][] array3 = new int [2][3];
		
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print("Ingresa los datos de la matriz ["+i+"]["+j+"]:");
				array1[i][j] = entrada.nextInt();
			}
		}
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print("Ingresa los datos de la matriz2 ["+i+"]["+j+"]:");
				array2[i][j] = entrada.nextInt();
			}
		}
		//++++++++++++++++++
		/*for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
			System.out.print(array1[i][j]+" ");
		}
			System.out.println(" ");
	}
		
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
			System.out.print(array2[i][j]);
			
		}
			System.out.println(" ");
	}
		*/
		
	


		
		/*for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				System.out.print(array1[i][j]);
				
			}
		}
		
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j]);
				
			}
		}
//++++++++++++++++++++++++++++++++
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
		 array3[i][j]=array1[i][j]+array2[i][j];
			
				
			}
		}
		
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				System.out.println(array1[i][j]);
				
			}
		}
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.println(array2[i][j]);
				
			}
		}
		for(int i=0; i<array3.length; i++) {
			for(int j=0; j<array3[i].length; j++) {
				System.out.println(array3[i][j]);
				
			}
		}
	
		++++++++++++++++++++++++++++++*/
		//TERMINA EL PROGRAMA+++++++++++++++++++++++++
		
		
		
		
		
		
           /*este codigo esta mal estructurado
            *  for(int i=0; i<array1.length; i++) {
            
			
			for(int j=0; j<array1.length;j++) {
				System.out.print("[ "+array1[i][j]+" ]");
				
			}
			if(i==1) {
				System.out.print("   +   ");
			}else
			{
				System.out.println("      ");
			}
		
			
			for(int j=0; j<array2.length; j++) {
				System.out.print("[ "+array2[i][j]+" ]");
				
			}
			if(i==1) {
				System.out.print("   =   ");
			}else
			{
				System.out.println("      ");
			}
			
			for(int j=0; j<array3.length; j++) {
				System.out.print("[ "+array3[i][j]+" ]");
				
			}
			System.out.println("");
		}
		
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
			System.out.print(array3[i][j]);
			
		}
			System.out.println(" ");
	}*/
		
		
		
		
		/*
		        int [][] matriz1 = new int[][] { {2,3,4}, {5,6,7} };
		        int [][] matriz2 = new int[][] { {1,1,1}, {1,1,1} };
		        sumarOtraMatriz (matriz1, matriz2);}
		    

		    public static int[][] sumarOtraMatriz(int[][] matrizA , int[][] matrizB) {
		        int[][] matrizResultado;
		        int filasA =matrizA.length;
		        int columnasA = matrizA[0].length;

		        int filasB =matrizB.length;
		        int columnasB = matrizB[0].length;

		        System.out.println("Primera matriz:");
		        for (int i = 0; i < filasA; i++) {
		            for (int j = 0; j < columnasA; j++) {
		                System.out.print(matrizA[i][j] + "   ");
		            }
		            System.out.println("");
		        }

		        System.out.println("Segunda matriz:");
		        for (int i = 0; i < filasB; i++) {
		            for (int j = 0; j < columnasB; j++) {
		                System.out.print(matrizB[i][j] + "   ");
		            }
		            System.out.println("");
		        }

		        if (filasA==filasB && columnasB==columnasA) {

		            matrizResultado = new int[filasA][columnasA];
		            for (int i = 0; i < filasA; i++) {
		                for (int j = 0; j < columnasA; j++) {
		                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
		                }
		            }

		        } else {
		            throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
		        }
		        System.out.println("Matriz resultado:");
		        for (int i = 0; i < filasA; i++) {
		            for (int j = 0; j < columnasA; j++) {
		                System.out.print(matrizResultado[i][j] + "   ");
		            }
		            System.out.println("");
		        }
		        return matrizResultado;*/
		
	
				/*ejemplo 12/11/2021
				 * String[][]n= {{"a","b","c"},{"1","2","3"}};
				
				String [][]nn=new String [2][3];
				for(int i=0; i<nn.length; i++) {
					for(int j=0; j<nn[i].length; j++) {
						nn[i][j]="0";
						
					}
				}
				for(int i=0; i<nn.length; i++) {
					for(int j=0; j<nn[i].length; j++) {
						System.out.println(nn[i][j]);
						
					}
				}
				*/
		/*
		 int matriza[][] = new int [3][3];
         int matrizb[][] = new int [3][3];
         int matrizc[][] = new int [3][3];
         int i, j;
         
         Scanner dato = new Scanner (System.in);
         
         System.out.println("Datos de la Matriz A :");
         
         for (i=0; i<matriza.length; i++){
             for (j=0; j<matriza.length; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matriza [i][j]= dato.nextInt();
                }
            }
            
            System.out.println("Datos de la Matriz B :");
            
            for (i=0; i<matrizb.length; i++){
             for (j=0; j<matrizb.length; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matrizb [i][j]= dato.nextInt();
                }
            }
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 matrizc [i][j]= matriza[i][j]+matrizb[i][j];
                }
            }
            
            System.out.println("Matriz resultante de la suma :");
             for (i=0;i<matrizc.length;i++){
             for (j=0;j<matrizc.length;j++) {
                System.out.print(matrizc[i][j] + " ");
            }
            System.out.println("");
            
        }
		
		*/
		 File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Yesica\\Documents\\workspace-sts-3.9.13.RELEASE\\Dia1\\src\\com\\archivo.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }     
		

		
	
	
}
}

		
		

	
    

	



