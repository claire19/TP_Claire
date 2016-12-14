package org.formation.spring.test;

import org.formation.spring.service.ServiceBillet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");

		ServiceBillet billet1 = ctxt.getBean(ServiceBillet.class);
		ServiceBillet billet2 = ctxt.getBean(ServiceBillet.class);
		ServiceBillet billet3 = ctxt.getBean(ServiceBillet.class);
		ServiceBillet billet4 = ctxt.getBean(ServiceBillet.class);
		
//		A commenter si on décide d'imprimer les places de théatre		
		billet1.setMovie("Et demain tout commence");
		billet2.setMovie("La fille de Brest");
		billet1.setSeance("mercredi 14/12 à 20h45");
		billet2.setSeance("lundi 26/12 à 14h");
		billet1.setLieu("Gaumont Parnasse");
		billet2.setLieu("Gaumont Opéra");
		billet1.print();
		billet2.print();
		
		
//		A décommenter si on décide d'imprimer les places de théatre
//		billet3.setMovie("Le malade imaginaire");
//		billet4.setMovie("Rhinocéros");
//		billet3.setSeance("mercredi 21/12 à 18h45");
//		billet4.setSeance("lundi 02/01 à 14h12");
//		billet3.setLieu("Les Feux de la Rampe");
//		billet4.setLieu("La Gaité Montparnasse");
//		billet3.print();
//		billet4.print();
		
		
		
		

		
		
	}

}
