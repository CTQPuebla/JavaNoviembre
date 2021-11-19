package Com;

public class MiModelo {
	
	String color;//tipo de pintura, textura, duravilidad
	float medidas;//construido, por habitacion 
	String direccion;//calles
	int numCuartos;//cuantos son
	String tipoPiso;//tipo, toda la casa es asi o hay cambios
	Jardin jardin;
	
	
	public MiModelo() {
			
	}


	public MiModelo(String color, float medidas, String direccion, int numCuartos, String tipoPiso, Jardin jardin) {
		super();
		this.color = color;
		this.medidas = medidas;
		this.direccion = direccion;
		this.numCuartos = numCuartos;
		this.tipoPiso = tipoPiso;
		this.jardin = jardin;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getMedidas() {
		return medidas;
	}


	public void setMedidas(float medidas) {
		this.medidas = medidas;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumCuartos() {
		return numCuartos;
	}


	public void setNumCuartos(int numCuartos) {
		this.numCuartos = numCuartos;
	}


	public String getTipoPiso() {
		return tipoPiso;
	}


	public void setTipoPiso(String tipoPiso) {
		this.tipoPiso = tipoPiso;
	}


	public Jardin getJardin() {
		return jardin;
	}


	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}


	@Override
	public String toString() {
		return "MiModelo [color=" + color + ", medidas=" + medidas + ", direccion=" + direccion + ", numCuartos="
				+ numCuartos + ", tipoPiso=" + tipoPiso + ", jardin=" + jardin + "]";
	}
	
	}
	
	
	
	
	


