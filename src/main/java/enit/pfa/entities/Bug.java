package enit.pfa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bug   {
	@Id
	@GeneratedValue
	private int id ;
	private String titre;


	private String categorie;
	private String description ;
	private String projectname ;

	public Bug(String titre, String categorie, String description, String projectname) {
		super();
		this.titre = titre;
		this.categorie = categorie;
		this.description = description;
		this.projectname = projectname;
	}
	public Bug() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public String toString() {
		return "Bug [id=" + id + ", titre=" + titre + ", categorie=" + categorie + ", description=" + description
				+ ", projectname=" + projectname + "]";
	}
	
	
}
