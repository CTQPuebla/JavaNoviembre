package Viajes;

public class Boleto {
	
	String fechaCompra;
	Cliente us;
	Viaje v;
	
	public Boleto() {
		
	}

	public Boleto(String fechaCompra, Cliente us, Viaje v) {
		super();
		this.fechaCompra = fechaCompra;
		this.us = us;
		this.v = v;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Cliente getUs() {
		return us;
	}

	public void setUs(Cliente us) {
		this.us = us;
	}

	public Viaje getV() {
		return v;
	}

	public void setV(Viaje v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Boleto [fechaCompra=" + fechaCompra + ", us=" + us + ", v=" + v + "]";
	}
	
	
	

	

}
