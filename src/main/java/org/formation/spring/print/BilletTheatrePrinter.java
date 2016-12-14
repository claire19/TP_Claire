package org.formation.spring.print;

import org.springframework.stereotype.Component;

@Component
public class BilletTheatrePrinter implements IBilletPrinter {

	public void print() {
		System.out.println("Place de théatre");
	}

	public void print(String piece, String seance, String lieu) {
		this.print();
		System.out.println("Pièce : "+piece+", seance : " +seance+" au théatre "+lieu);
		
	}
	
	
	

}
