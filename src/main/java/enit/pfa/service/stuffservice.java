package enit.pfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enit.pfa.entities.Stuff;
import enit.pfa.repository.stuff_repository;
@Service
public class stuffservice {
	 @Autowired
		stuff_repository stuff_repository ;
		public List<Stuff> getAllStuffs(){
			return stuff_repository.findAll();
		}
		public Stuff getStuffById(int id) {
		    return stuff_repository.findById(id).orElse(null);
		}
		public void addStuff(Stuff Stuff) {
		    stuff_repository.save(Stuff);
		}
		public void updateStuff(Stuff Stuff) {
		    stuff_repository.save(Stuff);
		}
		public void deleteStuff(int id) {
		  stuff_repository.deleteById(id);
		}
}
