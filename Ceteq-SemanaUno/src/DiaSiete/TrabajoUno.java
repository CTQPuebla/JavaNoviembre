package DiaSiete;

import java.io.*;

public class TrabajoUno {
	public static void main(String[] args) {
		String[] dias = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once",
				"Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte",
				"Vientiuno", "Veintidos", "Veintetres", "Veinticuatro", "Veinticinco", "Veintiseis", "Veintisiete",
				"Veintiocho", "Ventinueve", "Treinta", "Treintauno" };
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre", "Noviembre", "Diciembre" };
		String[] fechas = { "18011996", "30082012", "24122016", "11091999", "10041997", "01012009", "08081996",
				"17042020", "19112016", "31122021" };
		String fechaTexto = "";

		try {
			File archivo = new File("C:\\Users\\ramod\\OneDrive\\Escritorio\\ArchivosTest\\fechas.txt");
			FileWriter linea = new FileWriter(archivo, true);

			for (int i = 0; i < fechas.length; i++) {
				for (int k = 0; k < 31; k++) {
					if (Integer.parseInt(fechas[i].substring(0, 2)) == (k + 1)) {
						fechaTexto += dias[k] + " de ";
					}
				}

				for (int k2 = 0; k2 < 12; k2++) {
					if (Integer.parseInt(fechas[i].substring(2, 4)) == (k2 + 1)) {
						fechaTexto += meses[k2] + " de " + fechas[i].substring(4, 8);
					}
				}
				linea.write(fechaTexto + "\r\n");
				fechaTexto = "";
			}
			linea.write("- - - - - - - - - - - - - -" + "\r\n");
			linea.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
