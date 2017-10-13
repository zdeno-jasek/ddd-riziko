package sk.posam.riziko.application.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sk.posam.riziko.domain.riziko.Hodnotenie;
import sk.posam.riziko.domain.riziko.Riziko;
import sk.posam.riziko.domain.riziko.RizikoRepository;
import sk.posam.riziko.domain.vyhodnotenie.MieraRizika;
import sk.posam.riziko.domain.vyhodnotenie.VyberVypoctuMieryRizika;
import sk.posam.riziko.domain.vyhodnotenie.VypocetMieryPodlaHodnotenia;
import sk.posam.riziko.domain.vyhodnotenie.VypocetMieryRizika;

@RestController
@RequestMapping("/riziko")
public class RizikoRest {
	
	@Autowired
	private RizikoRepository rizikoRepository;

	// http://localhost:8080/riziko
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Riziko> getZoznamRizik() {
		return rizikoRepository.readAll();
	}
	
	// http://localhost:8080/riziko/miera?nazov=vybuchne%20sopka
	@RequestMapping(method=RequestMethod.GET, value="/miera")
	public MieraRizika getMieraRizika( String nazov ) {
		Riziko riziko = rizikoRepository.findByNazov( nazov );
		if ( riziko == null ) {
			return null;
		} else {
			Hodnotenie hodnotenie = riziko.getHodnotenie();
			VypocetMieryPodlaHodnotenia<Hodnotenie> vypocet = VyberVypoctuMieryRizika.vyberVypocet( hodnotenie );
			MieraRizika mieraRizika = vypocet.apply( hodnotenie );
			return mieraRizika;
		}
	}
}
