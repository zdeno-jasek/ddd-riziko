package sk.posam.riziko.domain.riziko;

public final class Riziko {
	
	private String nazov;
	private String popis;
	
	private Hodnotenie hodnotenie;
	
	private String eliminacia;

	public Riziko(String nazov) {
		this.nazov = nazov;
	}

	public Riziko(String nazov, Hodnotenie hodnotenie ) {
		this.nazov = nazov;
		this.hodnotenie = hodnotenie;
	}

	public String getNazov() {
		return nazov;
	}

	public String getPopis() {
		return popis;
	}

	public String getEliminacia() {
		return eliminacia;
	}

	public Hodnotenie getHodnotenie() {
		return hodnotenie;
	}

}
