package enit.pfa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enit.pfa.entities.Staff;
import enit.pfa.entities.Ticket;
import enit.pfa.repository.Ticket_repo;
import enit.pfa.repository.staff_repository;

@Service
public class ticketservice {
	 @Autowired
	 Ticket_repo ticket_repo;
	 @Autowired
	 staff_repository staff_repository ;
	 public List<Ticket> getAllTickets(){
			return ticket_repo.findAll();
		}
		public Ticket getTicketById(int id) {
		    return ticket_repo.findById(id).orElse(null);
		}
		public void addTicket(Ticket ticket) {
		    Staff staff = ticket.getStaff();
		    if (staff.getTickets() == null) {
		        staff.setTickets(new ArrayList<>());
		    }
		    staff.getTickets().add(ticket);
		    ticket_repo.save(ticket);
		}

		public void updateTicket(Ticket Ticket) {
		    ticket_repo.save(Ticket);
		}
		public void deleteTicket(int id) {
		  ticket_repo.deleteById(id);
		}
}
