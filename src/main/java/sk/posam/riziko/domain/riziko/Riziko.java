package sk.posam.riziko.domain.riziko;

public final class Riziko {
	
	private String nazov;
	private String popis;
	
	private Pravdepodobnost pravdepodobnost;
	private Dopad dopad;
	
	private String eliminacia;

	public Riziko(String nazov) {
		this.nazov = nazov;
	}

	public Riziko(String nazov, Pravdepodobnost pravdepodobnost, Dopad dopad ) {
		this.nazov = nazov;
		this.pravdepodobnost = pravdepodobnost;
		this.dopad = dopad;
	}

	public String getNazov() {
		return nazov;
	}

	public String getPopis() {
		return popis;
	}

	public Pravdepodobnost getPravdepodobnost() {
		return pravdepodobnost;
	}

	public Dopad getDopad() {
		return dopad;
	}

	public String getEliminacia() {
		return eliminacia;
	}

}
