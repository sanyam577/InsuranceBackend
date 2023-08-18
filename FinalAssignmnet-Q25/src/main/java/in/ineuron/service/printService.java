package in.ineuron.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class printService {

	public void printName() {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter amount to submit");
        int amount = scanner.nextInt();
        
        int balance = 450000;
 
        int totalBalance = amount+balance;
        
        System.out.println(" Mr." + name + "! Your account balance is "+totalBalance);

        // Remember to close the scanner when you're done with it
        scanner.close();
	}
	
	public void printOffers() {
		
		System.out.println("Ongoing offers are ::");
	
			System.out.println("1. Get 5% off on filpkart shopping with credit card");
			System.out.println("2. Get 10% off on taking car insurance with us");
		
	}
}
