package enit.pfa.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bug implements Serializable  {
	@Id
	@GeneratedValue
	private int id ;
	private String title;

	private String status;

	private String description ;
	private String projectname ;

	public Bug(String title, String status, String description, String projectname) {
		super();
		this.title = title;
		this.status = status;
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
	public String getTitle() {
		return title;
	}
	public void setTitre(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "Bug [id=" + id + ", title=" + title + ", status" + status + ", description=" + description
				+ ", projectname=" + projectname + "]";
	}
	
	
}
