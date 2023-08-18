package in.ineuron.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.service.printService;

@Component
public class Employeerunner implements CommandLineRunner {

	@Autowired
	private printService service;

	@Override 
	public void run(String... args) throws Exception {
		service.printName();
		System.out.println();
        service.printOffers();		
	}

}