
package com.training.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "PRODUIT")
public class Produit {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String nom;
	private String description;
	private int prixproduit;
	
	
	//
	public Produit(Long id, String nom, String description, int prixproduit) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prixproduit = prixproduit;
	}
	//
	public Produit() {
	}
	
	
	//*******//
	public Long getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getDescription() {
		return description;
	}
	public int getPrixproduit() {
		return prixproduit;
	}
	
	//**********//
	public void setId(Long id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrixproduit(int prixproduit) {
		this.prixproduit = prixproduit;
	}
	
	
	
	
}
