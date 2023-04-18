package enit.pfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enit.pfa.entities.Ticket;
import enit.pfa.service.ticketservice;
import enit.pfa.service.ticketservice;

@RestController
@RequestMapping("/Ticket")
@CrossOrigin("*")
public class ticketcontroller {
	@Autowired
	private ticketservice ticketservice ;
	@GetMapping("")
	public List<Ticket> getAllTickets(){
		return ticketservice.getAllTickets();}
	 @GetMapping("/{id}")
	    public Ticket getTicketById(@PathVariable int id) {
	        return ticketservice.getTicketById(id);
	    }
	 @PostMapping("")
	    public void addTicket(@RequestBody Ticket Ticket) {
	        ticketservice.addTicket(Ticket);
	    }
	 @PutMapping("/{id}")
	    public void updateTicket(@RequestBody Ticket Ticket, @PathVariable int id) {
	        Ticket.setId(id);
	        ticketservice.updateTicket(Ticket);
	    }
	 @DeleteMapping("/{id}")
	    public void deleteTicket(@PathVariable int id) {
	        ticketservice.deleteTicket(id);
	    }
}
