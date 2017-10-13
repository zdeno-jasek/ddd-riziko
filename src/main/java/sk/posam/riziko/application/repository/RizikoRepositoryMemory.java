package sk.posam.riziko.application.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Repository;

import sk.posam.riziko.domain.riziko.Dopad;
import sk.posam.riziko.domain.riziko.Pravdepodobnost;
import sk.posam.riziko.domain.riziko.Riziko;
import sk.posam.riziko.domain.riziko.RizikoRepository;

@Repository
final class RizikoRepositoryMemory implements RizikoRepository {
	
	private static final Collection<Riziko> zoznamRizik = new ArrayList<>();
	
	static {
		zoznamRizik.add( new Riziko( "spadne strecha", Pravdepodobnost.VYSOKA, Dopad.MALY ) );
		zoznamRizik.add( new Riziko( "vybuchne sopka", Pravdepodobnost.NIZKA, Dopad.VELKY ) );
	}

	@Override
	public Collection<Riziko> readAll() {
		return Collections.unmodifiableCollection( zoznamRizik );
	}

	@Override
	public Riziko findByNazov(String nazov) {
		for (Riziko riziko : zoznamRizik) {
			if ( riziko.getNazov().equals(nazov) ) {
				return riziko;
			}
		}
		return null;
	}

}
