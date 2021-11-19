package com;

public class Agenda {
String nombre;
String numero;
int edad;
String domicilio;
String correo;

public Agenda() {
	
}
public Agenda(String nombre,String numero,int edad,String domicilio,String correo) {
	super();
	this.nombre = nombre;
	this.numero = numero;
	this.edad = edad;
	this.domicilio = domicilio;
	this.correo = correo;
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getDomicilio() {
	return domicilio;
}
public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
@Override
public String toString() {
	return "Agenda [nombre=" + nombre + ", numero=" + numero + ", edad=" + edad + ", domicilio=" + domicilio
			+ ", correo=" + correo + "]";
}




}




