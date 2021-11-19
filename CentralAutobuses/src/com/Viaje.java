package com;

public class Viaje {
	private int folio;
	private String origen;
	private String destino;
	private String fecha;
	private Linea ln;
	private Chofer ch;
	private double precio;
	private static int contador;
	
	public Viaje() {
		contador++;
		this.folio = contador;
	}

	public Viaje(String origen, String destino, String fecha, Linea ln, Chofer ch, double precio) {
		super();
		contador++;
		this.folio = contador;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.ln = ln;
		this.ch = ch;
		this.precio = precio;
		
		for (Autobus autobus : ln.getList()) {
			if (!autobus.isEnUso()) {
				autobus.setEnUso(true);
				autobus.setFolio(this.folio);
			} else {
				System.out.println("Autobus: " + autobus.getPlacas());
			}
		}
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Linea getLn() {
		return ln;
	}

	public void setLn(Linea au) {
		this.ln = au;
	}

	public Chofer getCh() {
		return ch;
	}

	public void setCh(Chofer ch) {
		this.ch = ch;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getFolio() {
		return folio;
	}

	@Override
	public String toString() {
		return "Viaje [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", Linea=" + ln + ", Chofer=" + ch
				+ ", precio=" + precio + "]";
	}
	
	
}
