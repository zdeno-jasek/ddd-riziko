package sk.posam.riziko.domain.vyhodnotenie;

import sk.posam.riziko.domain.riziko.HodnotenieCiselnikmi;

public class VypocetMieryPodlaCiselnikovehoHodnotenia implements VypocetMieryPodlaHodnotenia<HodnotenieCiselnikmi> {

	@Override
	public MieraRizika apply(HodnotenieCiselnikmi t) {
		return MieraRizika.NIZKA;
	}

}
