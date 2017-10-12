package sk.posam.riziko.application.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sk.posam.riziko.domain.riziko.Riziko;
import sk.posam.riziko.domain.riziko.RizikoRepository;

@RestController
@RequestMapping("/riziko")
public class RizikoRest {
	
	@Autowired
	private RizikoRepository rizikoRepository;

	@RequestMapping(method=RequestMethod.GET)
	public Collection<Riziko> getZoznamRizik() {
		return rizikoRepository.readAll();
	}
}
