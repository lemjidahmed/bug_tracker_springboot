package enit.pfa.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
@DiscriminatorValue("admin")
public class Admin extends User{

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String email, String password) {
		super(email, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getRole() {
	    return "admin";
	}
	

}
