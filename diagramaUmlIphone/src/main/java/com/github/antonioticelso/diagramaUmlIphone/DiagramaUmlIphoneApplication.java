package com.github.antonioticelso.diagramaUmlIphone;

import com.github.antonioticelso.diagramaUmlIphone.model.AparelhoInternet;
import com.github.antonioticelso.diagramaUmlIphone.model.AparelhoMusical;
import com.github.antonioticelso.diagramaUmlIphone.model.AparelhoTelefonico;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiagramaUmlIphoneApplication {

	public static void main(String[] args) {

		AparelhoMusical musical = new AparelhoMusical();
		AparelhoTelefonico telefonico = new AparelhoTelefonico();
		AparelhoInternet internet = new AparelhoInternet();

		musical.getPlay();
		musical.getPause();
		musical.getPause();
		musical.getSelect();

		telefonico.getCall(98833664);
		telefonico.getCall(988336647);
		telefonico.getAtender(false);
		telefonico.getAtender(true);

		internet.getAddPage();
		internet.getAddPage();
		internet.getAddPage();
		internet.getUpPage(3);
		internet.getUpPage(2);
		internet.getUpPage(0);
		internet.getUpPage(7);

//		SpringApplication.run(DiagramaUmlIphoneApplication.class, args);

	}

}
