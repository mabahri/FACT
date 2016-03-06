package org.fact.services;

import java.util.List;

import org.fact.entities.Facture;
import org.fact.metier.FactureMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactureRestService {
	
	@Autowired
	private FactureMetier factureMetier;

	@RequestMapping(value="/factures",method=RequestMethod.POST)
	public Facture saveFacture(@RequestBody Facture c) {
		return factureMetier.saveFacture(c);
	}

	@RequestMapping(value="/factures",method=RequestMethod.GET)
	public List<Facture> listFacture() {
		return factureMetier.listFacture();
	}

}
