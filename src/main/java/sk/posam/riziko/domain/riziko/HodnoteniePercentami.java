package sk.posam.riziko.domain.riziko;

public final class HodnoteniePercentami implements Hodnotenie {

	private final int pravdepodobnost;
	private final int dopad;
	
	public HodnoteniePercentami(int pravdepodobnost, int dopad) {
		this.pravdepodobnost = pravdepodobnost;	// TODO: 0-100
		this.dopad = dopad;											// TODO: 0-100
	}

	public int getPravdepodobnost() {
		return pravdepodobnost;
	}

	public int getDopad() {
		return dopad;
	}
	
}
