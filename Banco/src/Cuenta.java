import java.util.Date;

public class Cuenta {

	int saldo;
	int max;
	int minimo;
	int folio;
	String tipoCuenta;
	Cliente cliente;

	Sucursal s;

	public Cuenta() {

	}

	public Cuenta(int saldo, int max, int minimo, int folio, String tipoCuenta, Cliente cliente, Sucursal s) {
		this.saldo = saldo;
		this.max = max;
		this.minimo = minimo;
		this.folio = folio;
		this.tipoCuenta = tipoCuenta;
		this.cliente = cliente;
		this.s = s;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
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
		return "Cuenta [saldo=" + saldo + ", max=" + max + ", minimo=" + minimo + ", folio=" + folio + ", tipoCuenta="
				+ tipoCuenta + ", cliente=" + cliente + ", s=" + s + "]";
	}

	public Object retirar(Cuenta c, int monto) {
		String direccion = "";

		if (c.getSaldo() < monto) {
			return "Sin fondos suficientes para el retiro";
		} else if ((c.getSaldo() - monto) < c.getMinimo()) {
			return "El retiro dejaria sin fondos suficientes a la cuenta";
		} else {
			direccion = c.getS().getDireccion();
			c.setSaldo(c.getSaldo() - monto);
			return new Comprobante("22 Enero 2008", direccion, c.getFolio(), monto);
		}
	}

	public Object transferir(Cuenta origen, Cuenta destino, int monto) {

		if (origen.getSaldo() < monto) {
			return "No hay saldo suficiente en la cuenta";
		} else if ((origen.getSaldo() - monto) < origen.getMinimo()) {
			return "El retiro excederia el minimo requerido en la cuenta";
		} else if (destino.getMax() < monto) {
			return "La cantidad excede el maximo permitido en la cuenta";
		} else if ((destino.getSaldo() + monto) > destino.getMax()) {
			return "La cantidad resultante excede el maximo permitido en la cuenta";
		} else {

			// Se realiza la transferencia
			origen.setSaldo(origen.getSaldo() - monto);
			destino.setSaldo(destino.getSaldo() + monto);

			System.out.println("Saldo actual en la cuenta origen" + origen.getSaldo());
			System.out.println("Saldo actual en la cuenta: " + destino.getSaldo());
			return new Comprobante("22 Enero 2008", origen.getS().getDireccion(), origen.getFolio(), monto);
		}

	}

}
