package enit.pfa.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="User")

public abstract class User implements Serializable {
  @Id
  @GeneratedValue
  protected int id ;
  protected String email ;
  protected String password ;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User( String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id +  ", email=" + email + ", password=" + password + "]";
}
  
  

}
