package com;

public class Cliente {
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String nombreC;
	public String ine;
	public double saldo;

	public Cliente(String nombreC, String ine, double saldo) {
		super();
		this.nombreC = nombreC;
		this.ine = ine;
		this.saldo = saldo;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public String getIne() {
		return ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [nombreC=" + nombreC + ", ine=" + ine + ", saldo=" + saldo + "]";
	}

}
