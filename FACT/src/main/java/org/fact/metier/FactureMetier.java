package org.fact.metier;

import java.util.List;

import org.fact.entities.Facture;

public interface FactureMetier {
	public Facture saveFacture(Facture c);
	public List<Facture> listFacture();

}
