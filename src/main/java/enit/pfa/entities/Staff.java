package enit.pfa.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Staff")
public class Staff extends User {
	

	private String name ;
	private String firstname ;
	private String  category ;
    public List<Ticket> tickets;
    
    public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Staff(String email, String password,String name, String firstname, String category) {
		super(email, password);
		this.name = name;
		this.firstname = firstname;
		this.category = category;
        this.tickets = new ArrayList<>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String getRole() {
	    return "staff";
	}

	
	
	
	
	
	

}
