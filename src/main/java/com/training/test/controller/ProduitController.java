package com.training.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.test.model.Produit;
import com.training.test.service.ProduitService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path ="/produit")
@AllArgsConstructor
public class ProduitController {

	///on contracte-notre-cotroller
	@Autowired
	private ProduitService produitService;
	
	///creer un pdt
	@PostMapping(path ="/create")
	public Produit create(@RequestBody Produit produit) {
		return produitService.creer(produit) ;
	}
	
	///lister les pdts
	@GetMapping(path="/read")
	public List<Produit> read(){
		return produitService.lire();
	} 
	
	///modifier les pdts	
	@PutMapping(path = "/update/{id}")    // on_envoi: ?name=camilo
	public Produit update(@PathVariable Long id, @RequestBody Produit produit){
		return produitService.modifier(id, produit);
	}
	
	
	///effacer les pdts
	@DeleteMapping(path="/delete/{id}")
	public String delete(@PathVariable Long id) {
		return produitService.Supprimer(id); 
		
	}
	
	
	
	
}
