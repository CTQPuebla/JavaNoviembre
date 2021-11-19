package com;

public class Cuenta {

	int folio;
	double saldo;
	int min;
	int max;
	String tipoCuenta;
	Cliente c;
	Sucursal s;

	public Cuenta() {

	}

	public Cuenta(int folio, double saldo, int min, int max, String tipoCuenta, Cliente c, Sucursal s) {
		this.folio = folio;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipoCuenta = tipoCuenta;
		this.c = c;
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

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public Sucursal getS() {
		return s;
	}

	public void setS(Sucursal s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Cuenta [folio=" + folio + ", saldo=" + saldo + ", min=" + min + ", max=" + max + ", tipoCuenta="
				+ tipoCuenta + ", c=" + c + ", s=" + s + "]";
	}

	public Object depositar(Cuenta c, int monto) {

		// validar por si el monto por si solo excede el maximo permitido
		if (c.getMax() < monto) {
			return " sobrepasa el maximo 1";

			// valida si el saldo actual + el monto
		} else if (c.getSaldo() > c.getMax()) {
			return "sobrepasa el maximo 2";
		} else {

			c.setSaldo(c.getSaldo() + monto);

			String direccion = c.getS().getDirreccion();

			return new Comprobante("18 noviembre", direccion, c.getFolio(), monto);
		}

	}

	public Object retirar(Cuenta c, int monto) {
		String direccion = "";
		if(c.getSaldo()<monto) {
			return "Sin saldo suficiente para hacer el retiro";
		}else
		if (c.getSaldo() - monto < c.getMin()) {
			return "el retiro dejara sin fondos suficientes a la cuenta";
			
		} else {
			
			direccion = c.getS().getDirreccion();
			c.setSaldo(c.getSaldo() - monto);

			return new Comprobante("17 de noviembre 2021", direccion, c.getFolio(), monto);
		}
	}

	public Object transferir(Cuenta oriCuenta, Cuenta deCuenta, int monto) {
		// CUENTA DESTINO
		// CANTIDAD

		// VALIDACIONES
		// Saldo Sufuciente
		//
		// validacion de la cuenta origen
		if (oriCuenta.getSaldo() < monto) {
			return "No hay saldo sufuciente en la cuenta";

		} else if ((oriCuenta.getSaldo() - monto) < oriCuenta.getMin()) {
			return "El retiro excedera el minimo en la cuenta";

			// validacion de la cuenta destino
		} else if (deCuenta.getMax() < monto) {
			return "excede el maximo de la cuenta destino";
		} else if (deCuenta.getSaldo() + monto > deCuenta.getMax()) {
			return "la cantidad resultante excede el maximo de la cuenta destino";

		} else {
			// se realiza la transferencia
			oriCuenta.setSaldo(oriCuenta.getSaldo() - monto);
			deCuenta.setSaldo(deCuenta.getSaldo() + monto);
			
			System.out.println("");
			
			return new Comprobante("17 de noviembre", oriCuenta.getS().getDirreccion(), oriCuenta.getFolio(), monto);
			

		}


	}
}
