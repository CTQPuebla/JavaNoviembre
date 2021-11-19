package com;

public class Cuenta extends Cliente {

	public Cuenta() {

	}

	String folio;
	int saldo;
	double min;
	double max;
	String tipoC;
	Cliente cliente;
	Sucursal s;

	public Cuenta(Cliente cliente, Sucursal s, String folio, int saldo, double min, double max, String tipoC) {

		this.folio = folio;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipoC = tipoC;
		this.cliente = cliente;
		this.s = s;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
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

	public String getTipoC() {
		return tipoC;
	}

	public void setTipoC(String tipoC) {
		this.tipoC = tipoC;
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
		return "Cuenta [folio=" + folio + ", saldo=" + saldo + ", min=" + min + ", max=" + max + ", tipoC=" + tipoC
				+ "]";
	}

	public Object depositar(Cuenta c, int monto) {

		String direccion = "";

		if (c.getMax() < monto) {

			return "Sobrepasa el maximo";
		} else if ((c.getSaldo() + monto) > c.getMax()) {
			return ":v";
		} else {
			c.setSaldo(c.getSaldo() + monto);
			direccion = c.getS().getDireccion();

			return new Comprobante("22 de enero 30029", direccion, 002, c.getFolio(), monto);
		}

	}

	public Object retirar(Cuenta c, int monto) {
		String direccionString = "";
		if (c.getSaldo()<monto) {
			return "Sin fondos";
		}else if((c.getSaldo() - monto) > c.getMin()) {
		return	"El retiro dejaria sin fondos a la cuenta";
		}
		else {
			direccionString = c.getS().getDireccion();
			c.setSaldo(c.getSaldo() - monto);
			return new Comprobante("20 de Noviembre", direccionString, 12, c.getFolio(), monto);
		}

	}

	public Object transferencia(Cuenta origen, Cuenta destino, int monto) {

		if (origen.getSaldo() < monto) {
			return "No hay saldo sufueciente";
		} else if ((origen.getSaldo() - monto) < origen.getMin()) {
			return "El retiro excede el minimo requerido en la cuenta";
		} else if (destino.getMax() < monto) {
			return "La cantidad excede el maximo permitido en la cuenta";
		} else if ((destino.getSaldo() + monto) > destino.getMax()) {
			return "La cantidad resultante excede el maximo permitido en la cuenta";
		} else {
			origen.setSaldo(origen.getSaldo() - monto);
			destino.setSaldo(destino.getSaldo() + monto);

			return new Comprobante("22 de Enero", origen.getS().getDireccion(),34, origen.getFolio(), monto);
		}

	}

}
