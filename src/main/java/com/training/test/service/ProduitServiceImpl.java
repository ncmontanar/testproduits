package com.training.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.test.DAO.ProduitDAO;
import com.training.test.model.Produit;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements  ProduitService {

	
	@Autowired
	private ProduitDAO produitDao;
	

	///methodepour_creer:save
	@Override
	public Produit creer(Produit produit) {

		return produitDao.save(produit);
	}

	///methodepour_lister:findall
	@Override
	public List<Produit> lire() {
		
		return produitDao.findAll();
	}

	///methodepour_modifier:if 
	@Override
	public Produit modifier(Long id, Produit produit) {

		return produitDao.findById(id)
				.map(p ->{
					p.setPrixproduit(produit.getPrixproduit());
					p.setNom(produit.getNom());
					p.setDescription(produit.getDescription());
					
					return produitDao.save(p);
					}).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
	}

	@Override
	public String Supprimer(Long id) {
		produitDao.deleteById(id);
		return "Produit Supprimé";
	}

}
