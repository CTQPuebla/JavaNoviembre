package com;

import java.util.Date;

public class Cliente extends Persona {
	protected int idCliente;
	protected Date fechaRegistro;
	protected boolean isVIP;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, int edad, String direccion, int idCliente, Date fechaRegistro, boolean isVIP) {
		super(nombre, edad, direccion);
		this.idCliente = idCliente;
		this.fechaRegistro = fechaRegistro;
		this.isVIP = isVIP;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + super.toString() + ", fechaRegistro=" + fechaRegistro + ", isVIP=" + isVIP + "]";
	}
	
	
}
