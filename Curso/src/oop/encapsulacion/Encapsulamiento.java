package oop.encapsulacion;

public class Encapsulamiento {
	private String nameString;
	private int edad;
	private double peso;
	private double altura;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Encapsulamiento [nameString=" + nameString + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}
	
	

}
