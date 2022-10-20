package com.github.antonioticelso.diagramaUmlIphone;

import com.github.antonioticelso.diagramaUmlIphone.model.AparelhoMusical;
import com.github.antonioticelso.diagramaUmlIphone.model.AparelhoTelefonico;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiagramaUmlIphoneApplication {

	public static void main(String[] args) {

		AparelhoMusical musical = new AparelhoMusical();

		musical.getPlay();
		musical.getPause();
		musical.getPause();
		musical.getSelect();

		AparelhoTelefonico telefonico = new AparelhoTelefonico();

		telefonico.getCall(98833664);
		telefonico.getCall(988336647);
		telefonico.getAtender(false);
		telefonico.getAtender(true);


//		SpringApplication.run(DiagramaUmlIphoneApplication.class, args);
	}

}
