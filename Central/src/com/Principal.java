package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Autobus bus1 = new Autobus ("A1", "Volvo", "ASJFHH", 40);
		Autobus bus2 = new Autobus ("A2", "Mercedes Benz", "KSHFHF", 33);
		Autobus bus3 = new Autobus ("A3", "Volvo", "PSHFI", 54);
		Autobus bus4 = new Autobus ("A4", "Mercedes Benz", "LAKFH", 45);
		Autobus bus5 = new Autobus ("A5", "Volvo", "POSHF", 43);
		
		Chofer c1 = new Chofer ("Manuel", "35");
		Chofer c2 = new Chofer ("Raul", "36");
	    Chofer c3 = new Chofer ("Hector", "38");
	    Chofer c4 = new Chofer ("Rolando", "39");
	    Chofer c5 = new Chofer ("Hugo", "40");

	    Usuario user = new Usuario ("Marisol", "05-08-2010");
	    
	    Terminal t1 = new Terminal ("Calle 1 centro Puebla", 8);
	    
	    //Agregando Viajes
	    t1.configurarViajes("Puebla", "CDMX", "14-04-2021", "15:40", bus3, c5, 450.50);
	    t1.configurarViajes("Puebla", "Guadalajara", "14-04-2021", "15:40", bus1, c5, 1200.50);
	    t1.configurarViajes("Puebla", "Monterrey", "14-04-2021", "15:40", bus5, c5, 1500.50);
	    t1.configurarViajes("Puebla", "Tijuana", "14-04-2021", "15:40", bus2, c5, 2800.50);
	    t1.configurarViajes("Puebla", "Hidalgo", "14-04-2021", "15:40", bus1, c5, 1000);
	    t1.configurarViajes("Puebla", "Oaxaca", "14-04-2021", "15:40", bus4, c5, 1100);
	    t1.configurarViajes("Puebla", "Guanajuato", "14-04-2021", "15:40", bus2, c5, 900);
	    t1.configurarViajes("Puebla", "Toluca", "14-04-2021", "15:40", bus5, c5, 780.2);
	    t1.configurarViajes("Puebla", "Cd Juarez", "14-04-2021", "15:40", bus1, c5, 680.0);
	    t1.configurarViajes("Puebla", "Guerrero", "14-04-2021", "15:40", bus4, c5, 900);
	    
  
	    Object [] r = t1.consultarViajes("Puebla", "Tijuana");
	    
	    Object response = t1.comprarBoleto("Puebla", "Tijuana", user);
	    System.out.println(response);
	    
	    System.out.println(r[0]);
	}
}