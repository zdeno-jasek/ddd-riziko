package sk.posam.riziko.domain;

public final class Riziko {
	
	private String nazov;
	private String popis;
	
	private Pravdepodobnost pravdepodobnost;
	private Dopad dopad;
	
	private String eliminacia;

	public Riziko(String nazov) {
		this.nazov = nazov;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public String getPopis() {
		return popis;
	}

	public void setPopis(String popis) {
		this.popis = popis;
	}

	public Pravdepodobnost getPravdepodobnost() {
		return pravdepodobnost;
	}

	public void setPravdepodobnost(Pravdepodobnost pravdepodobnost) {
		this.pravdepodobnost = pravdepodobnost;
	}

	public Dopad getDopad() {
		return dopad;
	}

	public void setDopad(Dopad dopad) {
		this.dopad = dopad;
	}

	public String getEliminacia() {
		return eliminacia;
	}

	public void setEliminacia(String eliminacia) {
		this.eliminacia = eliminacia;
	}
	
}
