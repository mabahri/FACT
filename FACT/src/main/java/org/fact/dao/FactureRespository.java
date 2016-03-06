package org.fact.dao;

import org.fact.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRespository extends JpaRepository<Facture, Long> {

}
