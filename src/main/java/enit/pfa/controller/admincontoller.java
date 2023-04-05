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

import enit.pfa.entities.Admin;
import enit.pfa.service.adminservice;

@RestController
@RequestMapping("/Admins")
@CrossOrigin("*")
public class admincontoller {
	@Autowired
	private adminservice adminservice ;
	@GetMapping("")
	public List<Admin> getAllAdmins(){
		return adminservice.getAllAdmins();}
	 @GetMapping("/{id}")
	    public Admin getAdminById(@PathVariable Long id) {
	        return adminservice.getAdminById(id);
	    }
	 @PostMapping("")
	    public void addAdmin(@RequestBody Admin admin) {
	        adminservice.addAdmin(admin);
	    }
	 @PutMapping("/{id}")
	    public void updateAdmin(@RequestBody Admin admin, @PathVariable Long id) {
	        admin.setId(id);
	        adminservice.updateAdmin(admin);
	    }
	 @DeleteMapping("/{id}")
	    public void deleteAdmin(@PathVariable Long id) {
	        adminservice.deleteAdmin(id);
	    }
	
	
	

}
