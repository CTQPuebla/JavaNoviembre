
public class Camisa extends Prenda {

	boolean MangaLarga;
	int numBotones;

	public Camisa() {

	}

	public Camisa(boolean mangaLarga, int numBotones) {
		super();
		MangaLarga = mangaLarga;
		this.numBotones = numBotones;
	}

	public boolean isMangaLarga() {
		return MangaLarga;
	}

	public void setMangaLarga(boolean mangaLarga) {
		MangaLarga = mangaLarga;
	}

	public int getNumBotones() {
		return numBotones;
	}

	public void setNumBotones(int numBotones) {
		this.numBotones = numBotones;
	}

	@Override
	public String toString() {
		return "Camisa [MangaLarga=" + MangaLarga + ", numBotones=" + numBotones + ", Nombre=" + Nombre + ", Color="
				+ Color + ", Estilo=" + Estilo + ", Material=" + Material + "]";
	}

	

}
