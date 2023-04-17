package enit.pfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enit.pfa.entities.Bug;
import enit.pfa.repository.bug_repo;

@Service
public class bugservice {
	 @Autowired
	bug_repo bug_repo ;
	public List<Bug> getAllBugs(){
		return bug_repo.findAll();
	}
	public Bug getBugById(int id) {
	    return bug_repo.findById(id).orElse(null);
	}
	public void addBug(Bug Bug) {
	    bug_repo.save(Bug);
	}
	public void updateBug(Bug Bug) {
	    bug_repo.save(Bug);
	}
	public void deleteBug(int id) {
	  bug_repo.deleteById(id);
	}

}
