package sk.posam.riziko.domain.vyhodnotenie;

import java.util.function.Function;

import sk.posam.riziko.domain.riziko.Hodnotenie;

public interface VypocetMieryPodlaHodnotenia <T extends Hodnotenie> extends Function<T, MieraRizika> {

}
