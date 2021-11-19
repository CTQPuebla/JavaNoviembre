
public class Cuenta {
	private double saldo;
	private double max;
	private double min;
	private int folio;
	private String tipoCunta;
	private Cliente cliente;
	private Sucursal sucursal;
	
	public Cuenta() {
		
	}

	public Cuenta(double saldo, double max, double min, int folio, String tipoCunta, Cliente cliente,
			Sucursal sucursal) {
		super();
		this.folio = folio;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipoCunta = tipoCunta;
		this.cliente = cliente;
		this.sucursal = sucursal;
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

	public String getTipoCunta() {
		return tipoCunta;
	}

	public void setTipoCunta(String tipoCunta) {
		this.tipoCunta = tipoCunta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Cuenta [folio=" + folio + ", saldo=" + saldo + ", min=" + min + ", max=" + max + ", tipoCunta="
				+ tipoCunta + ", cliente=" + cliente + ", sucursal=" + sucursal + "]";
	}

	public Object depositar(Cuenta c, double monto) {
		String direccion = "";
		
		if(c.getMax() < monto) {
			return "1: Sobrepasa el maximo: " + c.getMax() + " Monto: " + monto;
		} else if ((c.getSaldo() + monto) > c.getMax()) {
			return "2: Sobrepasa el maximo de la cuenta";
		} else {
			c.setSaldo(c.getSaldo() + monto);
			direccion = c.getSucursal().getDireccion();
			
			return new Comprobante("22 Enero 2018", direccion, c.getFolio(), monto);
		}
	}
}
