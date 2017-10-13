package sk.posam.riziko.domain.vyhodnotenie;

import sk.posam.riziko.domain.riziko.Dopad;
import sk.posam.riziko.domain.riziko.Pravdepodobnost;
import sk.posam.riziko.domain.riziko.Riziko;

public enum VypocetMieryRizika {
	VYSOKA(   MieraRizika.VYSOKA,  Pravdepodobnost.VYSOKA, null ),
	STREDNA1( MieraRizika.STREDNA, Pravdepodobnost.STREDNA, Dopad.VELKY ),
	STREDNA2( MieraRizika.STREDNA, Pravdepodobnost.STREDNA, Dopad.STREDNY ),
	STREDNA3( MieraRizika.STREDNA, Pravdepodobnost.NIZKA, 	Dopad.VELKY ),
	NIZKA1( 	MieraRizika.NIZKA,	 Pravdepodobnost.STREDNA, Dopad.MALY ),
	NIZKA2( 	MieraRizika.NIZKA,   Pravdepodobnost.NIZKA,	  Dopad.STREDNY ),
	NIZKA3(		MieraRizika.NIZKA,   Pravdepodobnost.NIZKA, 	Dopad.MALY )
	;

	private final MieraRizika miera;
	private final Pravdepodobnost pravdepodobnost;
	private Dopad dopad;
	
	private VypocetMieryRizika( MieraRizika miera, Pravdepodobnost pravdepodobnost, Dopad dopad ) {
		this.miera = miera;
		this.pravdepodobnost = pravdepodobnost;
		this.dopad = dopad;
	}

	/*
	public static MieraRizika vypocet(Riziko riziko) {
		Pravdepodobnost pravdepodobnost = riziko.getPravdepodobnost();
		Dopad dopad = riziko.getDopad();
		
		for (VypocetMieryRizika vypocet : VypocetMieryRizika.values() ) {
			if ( vypocet.splna( pravdepodobnost, dopad ) ) {
				return vypocet.miera;
			}
		}
		return null;
	}

	private boolean splna(Pravdepodobnost pravdepodobnost, Dopad dopad) {
		return ( this.pravdepodobnost == null || this.pravdepodobnost == pravdepodobnost )
				&& ( this.dopad == null || this.dopad == dopad );
	}
*/
}
