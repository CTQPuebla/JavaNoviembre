package DiaSiete;

import java.io.*;

public class LecturaEscrituraArchivos {
	public static void main(String[] args) {
		String line = "";
		int contador = 0;
		
		try {
			File archivo = new File("C:\\Users\\ramod\\OneDrive\\Escritorio\\ArchivosTest\\archivo.txt");
			
//			//LECTURA
//			FileWriter linea = new FileWriter(archivo, true);
//			for (int i = 0; i < 20; i++) {
//				linea.write("Hola mundo" + "\r\n");
//			}
//			linea.close();
			
			//ESCRITURA
			FileReader linea2 = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(linea2);
			
			System.out.println("Dentro del archivo de texto");
			
			while ((line = buffer.readLine()) != null) {
				contador++;
				System.out.println("Line: " + line + " " + contador);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
