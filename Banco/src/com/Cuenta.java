package com;

public class Cuenta {
	
	public Cuenta(){
	}	
	
	
	int folio;
	int numeroDeCuenta;
	double saldo;
	double min;
	double max;
	Cliente cliente;
	Sucursal s;
	String direccion="";
	String tipoCuenta;
	
	public Cuenta(int folio, int numeroDeCuenta, double saldo, double min, double max, Cliente cliente, Sucursal s,
			String direccion, String tipoCuenta) {
		super();
		this.folio = folio;
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.cliente = cliente;
		this.s = s;
		this.direccion = direccion;
		this.tipoCuenta = tipoCuenta;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [folio=" + folio + ", numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + ", min=" + min
				+ ", max=" + max + ", cliente=" + cliente + ", s=" + s + ", direccion=" + direccion + ", tipoCuenta="
				+ tipoCuenta + "]";
	}
	
	
	public Object depostiar (Cuenta c, int monto) {
		
		String direccion="";
		
		//Validar si el monto por si solo excede el maximo permitido
		if (c.getMax()<monto) {
			return "Sobrepasa el maximo";
			
		}else if ((c.getSaldo()+monto)>c.getMax()) {
			return "Sobrepasa el maximo";
			
		}else {
			c.setSaldo(c.getSaldo()+monto);
			
			direccion = c.getS().getDireccion();
			
			new return Comprobante ("22 Noviembre 1995", direccion )
		}
	}

	public Object retirar (Cuenta c, int monto) {
		    String direccion="";
		    
         if (c.getSaldo()<monto) {
        	 return "Sin fondos suficientes para el retiro";
         }else if((c.getSaldo()-monto)<c.getMin()) {
        	 return "El retiro dejaria sin fondos suficientes a la cuenta";
         }else {
        	 direccion= c.getS().getDireccion();
             c.setSaldo(c.getSaldo()-monto);
             return new Comprobante ("22 de Noviembre", direccion, c.getFolio(), monto);
         }
		    
	public Object transferir (Cuenta origen, Cuenta destino, int monto) {
		if(origen.getSaldo()<monto) {
			return "No hay saldo suficiente en la cuenta";
		} else if ((origen.getSaldo()-monto)<origen.getMin()) {
			return 	"El retiro excederia el minimo requerido en la cuenta";
		}else if(destino.getMax()<monto) {
			  return "La cantidad excede el maximo permitido en la cuenta";
		}else if((destino.getSaldo()+monto)>destino.getMax()) {
			  return "La cantidad resultante excede el maximo permitido en la cuenta";		}
	    } else {
	    	origen.setSaldo(origen.getSaldo()-monto);
	    	destino.setSaldo(destino.getSaldo()+monto);
	    	
	    	return new Comprobante("22 Noviembre 1998", origen.getS().getDireccion(), origen.getFolio(), monto);
	    }
	
}





<>