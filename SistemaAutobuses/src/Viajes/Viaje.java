package Viajes;

public class Viaje {
	
	String origen;
	String destino;
	String fecha;
	Autobus au;
	Chofer ch;
	double precio;
	String horaSalida;
	
	
	public Viaje() {
		
	}

	
	public Viaje(String origen, String destino, String fecha, Autobus au, Chofer ch, double precio, String horaSalida) {
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.au = au;
		this.ch = ch;
		this.precio = precio;
		this.horaSalida = horaSalida;
		
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

	public Autobus getAu() {
		return au;
	}

	public void setAu(Autobus au) {
		this.au = au;
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

	

	public String getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}


	@Override
	public String toString() {
		return "Viaje [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", au=" + au + ", ch=" + ch
				+ ", precio=" + precio + ", horaSalida=" + horaSalida +"]";
	}


	
	
	
	

}
