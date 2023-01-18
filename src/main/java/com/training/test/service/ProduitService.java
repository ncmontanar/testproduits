package com.training.test.service;

import java.util.List;

import com.training.test.model.Produit;

public interface ProduitService {

	///creer un pdt
	Produit creer(Produit produit);
	
	///lister les pdts
	List<Produit> lire();
	
	
	///modifier les pdts	
	Produit modifier(Long id, Produit produit);
	
	
	///effacer les pdts
	String Supprimer(Long id);
}
 