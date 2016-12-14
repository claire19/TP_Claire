package org.formation.spring.service;

import org.formation.spring.print.IBilletPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceBillet {

	@Autowired
//	A commenter si on décide d'imprimer les places de théatre
	@Qualifier("billetCinemaPrinter")
//	A décommenter si on décide d'imprimer les places de théatre
//	@Qualifier("billetTheatrePrinter")
	IBilletPrinter billetPrinter;
	private String movie;
	private String seance;
	private String lieu;

	// Construction du billet
	public void print(){
		billetPrinter.print(getMovie(), getSeance(), getLieu());
	}

	
	//Getter & setter
	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getSeance() {
		return seance;
	}

	public void setSeance(String seance) {
		this.seance = seance;
	}

	public void setBilletPrinter(IBilletPrinter billetPrinter) {
		this.billetPrinter = billetPrinter;
	}

}
