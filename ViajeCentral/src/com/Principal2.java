package com;

public class Principal2 {

	public static void main(String[] args) {
	
		Bus b1= new Bus("ABDC123", "M1", "Volvo", 40);
		Bus b2= new Bus("ABCD1234", "M2", "Mercedes Benz", 35);
		Bus b3= new Bus("FGHI123", "M3", "Volvo", 40);
		Bus b4 = new Bus("ABCD123", "M4", "Mercedez Benz", 35);
		Bus b5 = new Bus("JKLM789", "M5", "Volvo", 40);
		
		Pasajero p1= new Pasajero("Marisol", "08-10-1994");
		
		
		
		Chofer ch1 = new Chofer("Fernando", 40);
		Chofer ch2 = new Chofer("Gerardo", 35);
		Chofer ch3 = new Chofer("Raul", 51);
		Chofer ch4 = new Chofer("Arturo", 49);
		Chofer ch5 = new Chofer("Pedro", 43);
		
		Terminal t1 = new Terminal("Calle 1 Centro Publa", 8);
		
		
		//agregando viajes
		t1.configurarViajes("Puebla", "Cdmx", "14-04-2021", "15:40", b3, ch5, 450.50);
		t1.configurarViajes("Puebla", "Guadalajara", "14-04-2021", "15:40", b1, ch5, 1200.50);
		t1.configurarViajes("Puebla", "Monterrey", "14-04-2021", "15:40", b5, ch5, 1500.50);
		t1.configurarViajes("Puebla", "Tijuana", "14-04-2021", "15:40", b2, ch5, 2800.50);
		t1.configurarViajes("Puebla", "Hidalgo", "14-04-2021", "15:40", b1, ch5, 1000);
		t1.configurarViajes("Puebla", "Oaxaca", "14-04-2021", "15:40", b4, ch5, 1100);
		t1.configurarViajes("Puebla", "Guanajuato", "14-04-2021", "15:40", b2, ch5, 900);
		t1.configurarViajes("Puebla", "Toluca", "14-04-2021", "15:40", b5, ch5, 780.2);
		t1.configurarViajes("Puebla", "Cd Juarez", "14-04-2021", "15:40", b1, ch5, 680.0);
		t1.configurarViajes("Puebla", "Guerrero", "14-04-2021", "15:40", b4, ch5, 900);
		
		//Object [] r = t1.consultarViajes("Puebla", "Tijuana");
		
		
		Object response = t1.comprarBoleto("Puebla", "Tijuana", p1);
		System.out.println(response);



	}

}
