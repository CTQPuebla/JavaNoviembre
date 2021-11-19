package ADO;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Autobus bus1 = new Autobus("M1", "Volvo", "ABCD123", 40);
		Autobus bus2 = new Autobus("M2", "Mercedes Benz", "ABCD123", 35);
		Autobus bus3 = new Autobus("M3", "Volvo", "FGHI123", 40);
		Autobus bus4 = new Autobus("M4", "Mercedes Benz", "ABCD123", 35);
		Autobus bus5 = new Autobus("M5", "Volvo", "JKLM789", 40);
		
		Chofer c1 = new Chofer("Fernando", "40");
		Chofer c2 = new Chofer("Gerardo", "35");
		Chofer c3 = new Chofer("Raul", "51");
		Chofer c4 = new Chofer("Arturo", "49");
		Chofer c5 = new Chofer("Pedro", "43");
		
		Usuario user = new Usuario("Marisol", "08-10-1999");
		
		
		Terminal t1 = new Terminal("Calle 1 Centro Puebla", 8);
		
		//Agregando viajes
		t1.configurarViajes("Puebla", "Cdmx", "14-04-2021", "15:40", bus3, c5, 450.50);
		t1.configurarViajes("Puebla", "Guadalajara", "14-04-2021", "15:40", bus1, c5, 1200.50);
		t1.configurarViajes("Puebla", "Monterrey", "14-04-2021", "15:40", bus5, c5, 1500.50);
		t1.configurarViajes("Puebla", "Tijuana", "14-04-2021", "15:40", bus2, c5, 2800.50);
		t1.configurarViajes("Puebla", "Hidalgo", "14-04-2021", "15:40", bus1, c5, 1000);
		t1.configurarViajes("Puebla", "Oaxaca", "14-04-2021", "15:40", bus4, c5, 1100);
		t1.configurarViajes("Puebla", "Guanajuato", "14-04-2021", "15:40", bus2, c5, 900);
		t1.configurarViajes("Puebla", "Toluca", "14-04-2021", "15:40", bus5, c5, 780.2);
		t1.configurarViajes("Puebla", "Cd Juarez", "14-04-2021", "15:40", bus1, c5, 680.0);
		t1.configurarViajes("Puebla", "Guerrero", "14-04-2021", "15:40", bus4, c5, 900);
		
		//Object[] r = t1.consultarViajes("Puebla", "Tijuana");
		
		Object response = t1.comprarBoleto("Puebla", "Tijuana",user);
		System.out.println(response);
		
		
		
		
		
	}

}
