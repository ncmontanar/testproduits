package com.training.test.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.test.model.Produit;

public interface ProduitDAO extends JpaRepository<Produit, Long> {

}
