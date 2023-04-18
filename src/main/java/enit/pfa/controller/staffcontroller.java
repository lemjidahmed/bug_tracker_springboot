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

import enit.pfa.entities.Staff;
import enit.pfa.service.staffservice;
@RestController
@RequestMapping("/Staff")
@CrossOrigin("*")
public class staffcontroller {
	@Autowired
	private staffservice staffservice ;
	@GetMapping("")
	public List<Staff> getAllStaffs(){
		return staffservice.getAllStaffs();}
	 @GetMapping("/{id}")
	    public Staff getStaffById(@PathVariable int id) {
	        return staffservice.getStaffById(id);
	    }
	 @PostMapping("")
	    public void addStaff(@RequestBody Staff Staff) {
	        staffservice.addStaff(Staff);
	    }
	 @PutMapping("/{id}")
	    public void updateStaff(@RequestBody Staff Staff, @PathVariable int id) {
	        Staff.setId(id);
	        staffservice.updateStaff(Staff);
	    }
	 @DeleteMapping("/{id}")
	    public void deleteStaff(@PathVariable int id) {
	        staffservice.deleteStaff(id);
	    }

}
