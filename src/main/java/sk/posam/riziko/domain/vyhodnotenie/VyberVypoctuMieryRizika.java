package sk.posam.riziko.domain.vyhodnotenie;

import sk.posam.riziko.domain.riziko.Hodnotenie;
import sk.posam.riziko.domain.riziko.HodnotenieCiselnikmi;
import sk.posam.riziko.domain.riziko.HodnoteniePercentami;

public final class VyberVypoctuMieryRizika {
	
	public static VypocetMieryPodlaHodnotenia vyberVypocet( Hodnotenie hodnotenie ) {
		
		if ( hodnotenie instanceof HodnoteniePercentami ) {
			return new VypocetMieryPodlaPercentualnehoHodnotenia();
		}
		if ( hodnotenie instanceof HodnotenieCiselnikmi ) {
			return new VypocetMieryPodlaCiselnikovehoHodnotenia();
		}
		throw new IllegalArgumentException();
	}

}
