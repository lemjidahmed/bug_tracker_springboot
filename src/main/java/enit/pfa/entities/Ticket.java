package enit.pfa.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Ticket implements Serializable{
@Id
@GeneratedValue
private int id ;
private Bug bug ;
private Date startDate;
private Date limitDate;
private String solution;
@ManyToOne
@JoinColumn(name = "staff_id")
private Staff staff ;
public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}
public Ticket(Bug bug, Date startDate, Date limitDate, Staff staff) {
	super();
	this.bug = bug;
	this.startDate = startDate;
	this.limitDate = limitDate;
	this.staff = staff;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Bug getBug() {
	return bug;
}
public void setBug(Bug bug) {
	this.bug = bug;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getLimitDate() {
	return limitDate;
}
public void setLimitDate(Date limitDate) {
	this.limitDate = limitDate;
}
public String getSolution() {
	return solution;
}
public void setSolution(String solution) {
	this.solution = solution;
}
public Staff getStaff() {
	return staff;
}
public void setStaff(Staff staff) {
	this.staff = staff;
}


}
