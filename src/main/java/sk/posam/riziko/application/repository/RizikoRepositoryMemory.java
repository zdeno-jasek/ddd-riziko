package sk.posam.riziko.application.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Repository;

import sk.posam.riziko.domain.Riziko;
import sk.posam.riziko.domain.RizikoRepository;

@Repository
final class RizikoRepositoryMemory implements RizikoRepository {
	
	private static final Collection<Riziko> zoznamRizik = new ArrayList<>();
	
	static {
		zoznamRizik.add( new Riziko( "spadne strecha" ) );
		zoznamRizik.add( new Riziko( "vybuchne sopka" ) );
	}

	@Override
	public Collection<Riziko> getAll() {
		return Collections.unmodifiableCollection( zoznamRizik );
	}

}