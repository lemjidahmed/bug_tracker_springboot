package enit.pfa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stuff")
public class Stuff extends User{
	

	private String nom ;
	private String prenom ;
	private String  categorie ;
	private String[] assignedbug;
	public Stuff(String email, String password , String nom, String prenom, String categorie) {
		super(email,password);
		this.nom = nom;
		this.prenom = prenom;
		this.categorie = categorie;
		this.assignedbug = assignedbug;
	}
	
	
	

}
