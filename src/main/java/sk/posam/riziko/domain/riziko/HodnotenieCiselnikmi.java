package sk.posam.riziko.domain.riziko;

public final class HodnotenieCiselnikmi implements Hodnotenie {
	
	private final Pravdepodobnost pravdepodobnost;
	private final Dopad dopad;
	
	public HodnotenieCiselnikmi(Pravdepodobnost pravdepodobnost, Dopad dopad) {
		this.pravdepodobnost = pravdepodobnost;
		this.dopad = dopad;
	}
	
}
