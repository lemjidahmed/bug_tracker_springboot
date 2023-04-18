package enit.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enit.pfa.entities.Ticket;

public interface Ticket_repo extends JpaRepository<Ticket, Integer>{

}
