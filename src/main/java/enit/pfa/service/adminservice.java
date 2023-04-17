package enit.pfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enit.pfa.entities.Admin;
import enit.pfa.repository.admin_repository;
@Service
public class adminservice {
	 @Autowired
	private admin_repository admin_repository;
	
	public List<Admin> getAllAdmins(){
		return admin_repository.findAll();
	}
	public Admin getAdminById(Long id) {
	    return admin_repository.findById(id).orElse(null);
	}
	public void addAdmin(Admin admin) {
	    admin_repository.save(admin);
	}
	public void updateAdmin(Admin admin) {
	    admin_repository.save(admin);
	}
	public void deleteAdmin(Long id) {
	  admin_repository.deleteById(id);
	}
	
	


}
