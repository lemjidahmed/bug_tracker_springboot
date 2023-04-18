package enit.pfa;

import java.awt.print.Printable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import enit.pfa.entities.Admin;
import enit.pfa.entities.Bug;
import enit.pfa.entities.Staff;
import enit.pfa.entities.Ticket;
import enit.pfa.service.adminservice;
import enit.pfa.service.bugservice;
import enit.pfa.service.staffservice;
import enit.pfa.service.ticketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
@SpringBootApplication
public class BugTrackerApplication implements CommandLineRunner {
	@Autowired
	private adminservice adminservice ;
	@Autowired
	private bugservice bugservice;
	@Autowired
	private ticketservice ticketservice;
	@Autowired
	private staffservice staffservice;
	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		adminservice.addAdmin(new Admin("rayen", "aaaa")) ;
		Bug bug = new Bug("ww", "ww", "www", "www");
		Staff staff = new Staff("aa", "aa", "aaa", "aaa", "aa");
		//bugservice.addBug(bug);
		//staffservice.addStaff(staff);
		System.out.println(staff.getRole());
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date d1 = dateFormat.parse("12/02/2023");
		java.util.Date d2 = dateFormat.parse("30/04/2023");
		java.sql.Date sqlDate1 = new java.sql.Date(d1.getTime());
		java.sql.Date sqlDate2 = new java.sql.Date(d2.getTime());

		//Staff staff2 = staffservice.getStaffById(1202);
		ticketservice.addTicket(new Ticket (bug, sqlDate1, sqlDate2, staff));
		List<Ticket> staff2Tickets = staff.getTickets();
		if (staff2Tickets != null && !staff2Tickets.isEmpty()) {
			  for (Ticket ticket : staff2Tickets) {
			        System.out.println(ticket.getLimitDate());		}}*/



	//	staffservice.getAllStaffs().forEach(c->{System.out.println(c.getTickets().get(0).getId());});
		//List<Ticket> tickets = staff.getTickets();
		//		println(tickets.get(0));
		//for (int i=0 ;i<5;i++)
			//println(staff.tickets);
		//adminservice.addAdmin(new Admin("baha", "bbb")) ;
		/*adminservice.getAllAdmins().forEach(c->{System.out.println(c.getEmail());
		});
		adminservice.deleteAdmin(Long.valueOf(3));
		Admin a1 = adminservice.getAdminById(Long.valueOf(1));
		a1.setPassword("rayen");
		adminservice.updateAdmin(a1);*/
		//Bug b1 = new Bug("restapi", "Http api", "functions not working", "pfa");
	//	bugservice.addBug(b1);
		//bugservice.deleteBug(2);

		//bugservice.addBug(new Bug("aaa", "aaa", "aa aa", "aaa"));
	}
	/*@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);}*/
}
