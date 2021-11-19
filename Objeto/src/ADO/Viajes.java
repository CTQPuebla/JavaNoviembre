package ADO;

public class Viajes {
	
	String origen;
	String destino;
	String fecha;
	Autobus bus;
	Chofer ch;
	double precio;
	String horaSalida;
	
	public Viajes() {
		
	}

	public Viajes(String origen, String destino, String fecha, Autobus bus, Chofer ch, double precio,
			String horaSalida) {
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.bus = bus;
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

	public Autobus getBus() {
		return bus;
	}

	public void setBus(Autobus bus) {
		this.bus = bus;
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
		return "Viajes [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", bus=" + bus + ", ch=" + ch
				+ ", precio=" + precio + ", horaSalida=" + horaSalida + "]";
	}

}
