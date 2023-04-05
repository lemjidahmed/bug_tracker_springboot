package enit.pfa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stuff")
public class Stuff extends User{
	private String nom ;
	private String prenom ;
	private String  categorie ;
	private String[] assignedbug;
	
	

}
