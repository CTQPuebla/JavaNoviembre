package com;

public class Cuenta {
	int folio;
	double saldo;
	int min;
	int max;
	String tipoc;
    Cliente cliente;
    Sucursal s;
	public Cuenta()
	{
		
	}
	public Cuenta(int folio, double saldo, int min, int max, String tipoc, Cliente cliente, Sucursal s) {
	
		this.folio = folio;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipoc = tipoc;
		this.cliente = cliente;
		this.s = s;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getTipoc() {
		return tipoc;
	}
	public void setTipoc(String tipoc) {
		this.tipoc = tipoc;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Sucursal getS() {
		return s;
	}
	public void setS(Sucursal s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Cuenta [folio=" + folio + ", saldo=" + saldo + ", min=" + min + ", max=" + max + ", tipoc=" + tipoc
				+ ", cliente=" + cliente + ", s=" + s + "]";
	}
	public Object depositar(Cuenta c,int monto) {
		String direccion="";
		
		if(c.getMax()<monto){
			return "sobre pasa el maximo";		
			}else if((c.getSaldo()+monto)>c.getMax()) {
				return "sobre pasa el maximo";
				
			}else {
				c.setSaldo(c.getSaldo()+monto);
				direccion=c.getS().getDireccion();
				return new Comprobante("22 Enero 2008",direccion,c.getFolio(),monto);
				
			}
	}
	
	public Object retirar(Cuenta c,int monto ) {
		String direccion="";
		if(c.getSaldo()<monto) {
			return "sin fondos suficientes para el retiro";
		}else if((c.getSaldo()-monto)<c.getMin()) {
			return "El retiro dejaria sin fondos suficientes a la cuenta";
	
	}else {
		direccion=c.getS().getDireccion();
		c.setSaldo(c.getSaldo()-monto);
		return new Comprobante("22 de Enero 2008",direccion,c.getFolio(),monto);
	
	}
}

	
	public Object transferir(Cuenta origen,Cuenta destino,int monto) {
	
	//
	//cuenta destino
		
	//validaciones
    //Saldo suficientes
	//
	if(origen.getSaldo()<monto) {
		return "no hay saldo suficiente";
	}else if((origen.getSaldo()-monto)<origen.getMin()) {
		return "el retiro excederia el minimo requerido en la cuenta";
	}else if(destino.getMax()<monto) {
		return "la cantidad excede el maximo permitido en la cuenta";
		
	}else if((destino.getSaldo()+monto)>destino.getMax()) {
		return "la cantidad resultante excede el maximo permitido";
	}else {
		origen.setSaldo(origen.getSaldo()-monto);
		destino.setSaldo(destino.getSaldo()+monto);
		
		System.out.println("saldo actual en la cuenta origen"+origen.getSaldo());
		System.out.println("saldo actual en la cuenta"+destino.getSaldo());
		
		return new Comprobante("22 Enero 2008",origen.getS().getDireccion(),origen.getFolio(),monto);
	}

	}
	
	
	
}
