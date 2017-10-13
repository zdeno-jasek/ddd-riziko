package sk.posam.riziko.domain.riziko;

import java.util.Collection;

public interface RizikoRepository {

	Collection<Riziko> readAll();

	Riziko findByNazov(String nazov);
}
