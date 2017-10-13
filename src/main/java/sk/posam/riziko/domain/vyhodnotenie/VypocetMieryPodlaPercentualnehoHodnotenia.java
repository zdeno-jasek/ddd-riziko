package sk.posam.riziko.domain.vyhodnotenie;

import sk.posam.riziko.domain.riziko.HodnoteniePercentami;

public class VypocetMieryPodlaPercentualnehoHodnotenia implements VypocetMieryPodlaHodnotenia<HodnoteniePercentami> {

	@Override
	public MieraRizika apply(HodnoteniePercentami hodnotenie) {
		int faktor = hodnotenie.getDopad() * hodnotenie.getPravdepodobnost() / 100;
		
		if ( faktor < 25 ) 								 { return MieraRizika.NIZKA; }
		if ( faktor >= 25 && faktor < 50 ) { return MieraRizika.STREDNA; }
		if ( faktor >= 66 )								 { return MieraRizika.VYSOKA; }		
		
		return null;
	}

}
