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

import enit.pfa.entities.Stuff;
import enit.pfa.service.stuffservice;
@RestController
@RequestMapping("/Stuff")
@CrossOrigin("*")
public class stuffcontroller {
	@Autowired
	private stuffservice Stuffservice ;
	@GetMapping("")
	public List<Stuff> getAllStuffs(){
		return Stuffservice.getAllStuffs();}
	 @GetMapping("/{id}")
	    public Stuff getStuffById(@PathVariable int id) {
	        return Stuffservice.getStuffById(id);
	    }
	 @PostMapping("")
	    public void addStuff(@RequestBody Stuff Stuff) {
	        Stuffservice.addStuff(Stuff);
	    }
	 @PutMapping("/{id}")
	    public void updateStuff(@RequestBody Stuff Stuff, @PathVariable int id) {
	        Stuff.setId(id);
	        Stuffservice.updateStuff(Stuff);
	    }
	 @DeleteMapping("/{id}")
	    public void deleteStuff(@PathVariable int id) {
	        Stuffservice.deleteStuff(id);
	    }

}
