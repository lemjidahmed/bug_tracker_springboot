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

import enit.pfa.entities.Bug;
import enit.pfa.service.bugservice;

@RestController
@RequestMapping("/Bug")
@CrossOrigin("*")
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "*", allowedHeaders = "*")

public class bugcontroller {
	@Autowired
	private bugservice bugservice ;
	@GetMapping("")
	public List<Bug> getAllBugs(){
		return bugservice.getAllBugs();}
	 @GetMapping("/{id}")
	    public Bug getBugById(@PathVariable int id) {
	        return bugservice.getBugById(id);
	    }
	 @PostMapping("")
	    public void addBug(@RequestBody Bug Bug) {
	        bugservice.addBug(Bug);
	    }
	 @PutMapping("/{id}")
	    public void updateBug(@RequestBody Bug Bug, @PathVariable int id) {
	        Bug.setId(id);
	        bugservice.updateBug(Bug);
	    }
	 @DeleteMapping("/{id}")
	    public void deleteBug(@PathVariable int id) {
	        bugservice.deleteBug(id);
	    }

}
