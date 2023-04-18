package enit.pfa.entities;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="User")
@DiscriminatorColumn(name="Role")

public abstract class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected int id ;
  protected String username ;
  protected String password ;
  
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User( String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}



public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id +  ", username=" + username + ", password=" + password + "]";
}
public abstract String getRole();
  
  

}
