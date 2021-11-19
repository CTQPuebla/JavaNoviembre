package Banco;

public class Comprobante {
	
	String feha;
	String lugar;
	
	int numeroCuenta;
	int  monto;
	
	public Comprobante() {
		
	}

	public Comprobante(String feha, String lugar, int numeroCuenta, int  monto) {
		
		this.feha = feha;
		this.lugar = lugar;
		
		this.numeroCuenta = numeroCuenta;
		this.monto = monto;
	}

	public String getFeha() {
		return feha;
	}

	public void setFeha(String feha) {
		this.feha = feha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int  getMonto() {
		return monto;
	}

	public void setMonto(int  monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Comprobante [feha=" + feha + ", lugar=" + lugar + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto
				+ "]";
	}


	
	
	
	

}
