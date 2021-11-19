package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Autobus bus1=new Autobus("M1","Volvo","ACDEF",40);
		Autobus bus2=new Autobus("M2","Mercedez","FEFGHI",35);
		Autobus bus3=new Autobus("M3","Volvo","JKLMNOP",40);
		Autobus bus4=new Autobus("M4","Mercedez","QERSBDY",35);
		Autobus bus5=new Autobus("M5","Volvo","ZXNDYT",40);
		
		
		Chofer c1=new Chofer("Juan ","40");
		Chofer c2=new Chofer("Manuel ","30");
		Chofer c3=new Chofer("Francisco","20");
		Chofer c4=new Chofer("Adrian ","50");
		Chofer c5=new Chofer("Marcelo","60");
		
		
		
		
		Terminal t1=new Terminal("Calle 1 centro puebla",8);
		
		Usuario user=new Usuario("Juan Bibiano","01-03-1997");
		
		
		
		t1.ConfigurarViajes("Puebla","cdmx", "14-04-2021", "15:40", bus3, c5, 450.50);
		t1.ConfigurarViajes("Puebla","Guadalajara", "14-04-2021", "15:40", bus1, c5, 1200.50);
		t1.ConfigurarViajes("Puebla","Monterrey", "14-04-2021", "15:40", bus5, c5, 1500.50);
		t1.ConfigurarViajes("Puebla","Tijuana", "14-04-2021", "15:40", bus2, c5, 2800.50);
		t1.ConfigurarViajes("Puebla","Hidalgo", "14-04-2021", "15:40", bus1, c5, 1000);
		t1.ConfigurarViajes("Puebla","Oaxaca", "14-04-2021", "15:40", bus4, c5, 1100);
		t1.ConfigurarViajes("Puebla","Guanajuato", "14-04-2021", "15:40", bus2, c5, 900);
		t1.ConfigurarViajes("Puebla","Toluca", "14-04-2021", "15:40", bus5, c5, 780.2);
		t1.ConfigurarViajes("Puebla","Cd Juarez", "14-04-2021", "15:40", bus1, c5, 680.0);
		t1.ConfigurarViajes("Puebla","Guerrero", "14-04-2021", "15:40", bus4, c5, 900);
		
		
		
		Object r=t1.ComprarBoleto("Puebla","Monterrey", user);
		System.out.println(r);
		
		
	}

}
