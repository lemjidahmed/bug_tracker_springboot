package enit.pfa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import enit.pfa.entities.Admin;
import enit.pfa.entities.Bug;
import enit.pfa.service.adminservice;
import enit.pfa.service.bugservice;

@SpringBootApplication
public class BugTrackerApplication implements CommandLineRunner {
	@Autowired
	private adminservice adminservice ;
	@Autowired
	private bugservice bugservice;

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//adminservice.addAdmin(new Admin("rayen", "aaaa")) ;
		bugservice.addBug(new Bug("aaa", "aaa", "aa aa", "aaa"));
		//adminservice.addAdmin(new Admin("baha", "bbb")) ;
		/*adminservice.getAllAdmins().forEach(c->{System.out.println(c.getEmail());
		});
		adminservice.deleteAdmin(Long.valueOf(3));
		Admin a1 = adminservice.getAdminById(Long.valueOf(1));
		a1.setPassword("rayen");
		adminservice.updateAdmin(a1);*/
		Bug b1 = new Bug("restapi", "Http api", "functions not working", "pfa");
		bugservice.addBug(b1);
		bugservice.deleteBug(2);

		//bugservice.addBug(new Bug("aaa", "aaa", "aa aa", "aaa"));
	}

}
