package enit.pfa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer extends User{
	private String nom ;
	private String prenom ; 
	private String projectname ;
	public Customer(String nom, String prenom, String projectname) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.projectname = projectname;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public String toString() {
		return "Customer [nom=" + nom + ", prenom=" + prenom + ", projectname=" + projectname + "]";
	}
	
}
