package OOP;

public class Coche {
	
	private  int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
	}
	
	public String setDimeDatos () {
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " +
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + "kg";
	}
	
	public void setEstableceColor(String color_coche) {
		
		color = color_coche;
	}
	
	public String getDimeColor() {
		
		return "El color del coche es " + color;
		
	}
	
	public void setConfiguraAsientos(String asientos_cuero) {
		
		if(asientos_cuero.equals("si")) {
			
			this.asientos_cuero = true;
		}
		
		else {
			
			this.asientos_cuero = false;
		}
		
	}
	
	public Boolean getConfigurarAsientos() {
		
		if(asientos_cuero == true) {
			
			System.out.println("El coche tiene asientos de cuero");
		} else {
			
			 System.out.println("El coche tiene asientos de serie");
		}
			
		return asientos_cuero;
		
		
	}

	public void setConfigurarAsientos() {
		
	}
	
	public void configurar_climatizador(String climatizador) {
		
		if(climatizador.equals("si")) {
			
			this.climatizador = true;
		}
		
		else {
			
			this.climatizador = false;
		}
		
	}
	
	public Boolean getConfigurarClimatizador() {
		
		if(climatizador == true) {
			
			System.out.println("El coche incorpora climatizador");
		}
		
		else {
			
			System.out.println("El coche lleva aire acondicionado");
		}
		return climatizador;
	}

	public String getDimePeso() {
		
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero == true) {
			
			peso_total = peso_total + 50;
		}
		
		if(climatizador == true) {
				
			peso_total = peso_total + 20;	
		
		}
			return "El peso del coche es " + peso_total;
	}
}