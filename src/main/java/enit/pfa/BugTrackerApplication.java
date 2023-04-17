package enit.pfa;

import java.util.Arrays;

//import org.apache.catalina.filters.CorsFilter;
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
import enit.pfa.entities.Stuff;
import enit.pfa.service.adminservice;
import enit.pfa.service.bugservice;
import enit.pfa.service.stuffservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class BugTrackerApplication implements CommandLineRunner {
	@Autowired
	private adminservice adminservice ;
	@Autowired
	private bugservice bugservice;
	@Autowired
	private stuffservice stuffservice;

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//adminservice.addAdmin(new Admin("rayen", "aaaa")) ;
		//bugservice.addBug(new Bug("aaa", "aaa", "aa aa", "aaa"));
		stuffservice.addStuff(new Stuff("aaa","ddd","aa","bb","eee"));
		//adminservice.addAdmin(new Admin("baha", "bbb")) ;
		/*adminservice.getAllAdmins().forEach(c->{System.out.println(c.getEmail());
		});
		adminservice.deleteAdmin(Long.valueOf(3));
		Admin a1 = adminservice.getAdminById(Long.valueOf(1));
		a1.setPassword("rayen");
		adminservice.updateAdmin(a1);*/
		/*Bug b1 = new Bug("restapi", "Http api", "functions not working", "pfa");
		bugservice.addBug(b1);
		bugservice.deleteBug(2);*/

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
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}*/
}
