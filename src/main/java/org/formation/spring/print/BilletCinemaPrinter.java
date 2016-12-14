package org.formation.spring.print;

import org.springframework.stereotype.Component;

@Component
public class BilletCinemaPrinter implements IBilletPrinter {

	public void print() {
		System.out.println("Place de cinéma");

	}

	public void print(String movie, String seance, String lieu) {
		this.print();
		System.out.println("Film : " + movie + ", séance de : " + seance+", au cinéma "+lieu);

	}

}
