
public class Pantalon extends Prenda {

	boolean cinturon;

	public Pantalon() {

	}

	public Pantalon(boolean cinturon) {
		this.cinturon = cinturon;
	}

	public boolean isCinturon() {
		return cinturon;
	}

	public void setCinturon(boolean cinturon) {
		this.cinturon = cinturon;
	}

	@Override
	public String toString() {
		return "Pantalon [cinturon=" + cinturon + ", Nombre=" + Nombre + ", Color=" + Color + ", Estilo=" + Estilo
				+ ", Material=" + Material + "]";
	}

}
