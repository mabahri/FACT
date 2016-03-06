package org.fact.metier;

import java.util.List;

import org.fact.dao.FactureRespository;
import org.fact.entities.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactureMetierImpl implements FactureMetier {
	
	@Autowired
	private FactureRespository factureRespository;
	
	public Facture saveFacture(Facture c) {
		return factureRespository.save(c);
	}

	public List<Facture> listFacture() {
		return factureRespository.findAll();
	}

}
