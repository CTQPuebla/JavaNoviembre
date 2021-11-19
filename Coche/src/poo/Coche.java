package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	String color;
	int pesoTotal;
	boolean asientosCuero, climatisado;
	
	public Coche() {
		
		ruedas= 4;
		largo= 2000;
		ancho= 300;
		motor= 1600;
		pesoPlataforma= 500;
		
		
	}
    
	public String dimeLargo() { //GETTER
		return "El largo del coche es " + largo;
  }
	public void establicerColor(String colorCoche) { //SETTER
		
		color=colorCoche;
	}
	
	public String dimeColor() {
		return "El color del cohe es " + color;		
	}
}
