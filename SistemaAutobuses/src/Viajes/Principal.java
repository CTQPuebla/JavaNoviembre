package Viajes;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cl1= new Cliente("josias", "18 agosto 1996");
		Cliente cl2= new Cliente("Juan", "03 marzo 1997");
		Cliente cl3= new Cliente("Samira", "18 Octubre 2001");
		
		Chofer ch1=new Chofer("juan", 40);
		Chofer ch2=new Chofer("pedro", 30);
		Chofer ch3=new Chofer("pablo", 27);
		
		Autobus au1=new Autobus("M1", " Mercedes", "GUJJ978", 40);
		Autobus au2=new Autobus("M2", " Ford", "FMD12AS", 40);
		Autobus au3=new Autobus("M3", " Mercedes", "47MAS12", 40);
		Autobus au4=new Autobus("M4", " Volvo", "47TML1", 40);
		Autobus au5=new Autobus("M5", " Volvo", "M7TML1", 40);
		
		Terminal t1=new Terminal("C. Puebla 1", 5);
		
		//AGREGANDO VIAJE
		t1.ConfigurarViajes("puebla", "CDMX", "14-04-2021", "15:40", au3, ch1, 450.50);
		t1.ConfigurarViajes("puebla", "Guadalajara", "14-04-2021", "15:40", au1, ch1, 1250.50);
		t1.ConfigurarViajes("puebla", "Monterrey", "14-04-2021", "15:40", au5, ch1, 2800.50);
		t1.ConfigurarViajes("puebla", "Tijuana", "14-04-2021", "15:40", au2, ch1, 1000.00);
		t1.ConfigurarViajes("puebla", "Hidalgo", "14-04-2021", "15:40", au1, ch3, 450.50);
		t1.ConfigurarViajes("puebla", "Oaxaca", "14-04-2021", "15:40", au4, ch1, 450.50);
		t1.ConfigurarViajes("puebla", "Guanajuato", "14-04-2021", "15:40", au2, ch1, 450.50);
		t1.ConfigurarViajes("puebla", "Toluca", "14-04-2021", "15:40", au1, ch1, 450.50);
		t1.ConfigurarViajes("puebla", "Cd Juarez", "14-04-2021", "15:40", au5, ch1, 450.50);
		t1.ConfigurarViajes("puebla", "Guerrero", "14-04-2021", "15:40", au1, ch1, 450.50);
		
		
		//Viaje v=new Viaje(t1.getDirrecion(), t3.getDirrecion(), "11 de nov 2021", au1, ch1, 1200.0," 08:00");
		
		//Object[] r= t1.ConsultarViajes("Puebla", "CDMX");
		Object[]  r= t1.ConsultarViajes("puebla", "Tijuana");
		System.out.println(r[0]);
		
//		Object respuesta = t1.comprarBoleto("puebla", "Tijuana", cl1);
//		System.out.println(respuesta);
//	
		
		
				
	}

}
