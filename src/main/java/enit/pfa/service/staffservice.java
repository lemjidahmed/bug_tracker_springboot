package enit.pfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enit.pfa.entities.Staff;
import enit.pfa.repository.staff_repository;
@Service
public class staffservice {
	 @Autowired
	 staff_repository Staff_repository;
		public List<Staff> getAllStaffs(){
			return Staff_repository.findAll();
		}
		public Staff getStaffById(int id) {
		    return Staff_repository.findById(id).orElse(null);
		}
		public void addStaff(Staff Staff) {
		    Staff_repository.save(Staff);
		}
		public void updateStaff(Staff Staff) {
		    Staff_repository.save(Staff);
		}
		public void deleteStaff(int id) {
		  Staff_repository.deleteById(id);
		}
}
