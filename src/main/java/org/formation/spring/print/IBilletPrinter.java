package org.formation.spring.print;

import org.springframework.stereotype.Component;

@Component
public interface IBilletPrinter {

	public void print();

	public void print(String divertissement, String seance, String lieu);

}
