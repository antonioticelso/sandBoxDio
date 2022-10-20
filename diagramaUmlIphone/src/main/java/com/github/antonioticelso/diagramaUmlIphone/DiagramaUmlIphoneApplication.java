package com.github.antonioticelso.diagramaUmlIphone;

import com.github.antonioticelso.diagramaUmlIphone.model.AparelhoMusical;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiagramaUmlIphoneApplication {

	public static void main(String[] args) {

		AparelhoMusical aparelho = new AparelhoMusical();

		aparelho.getTocar();


//		SpringApplication.run(DiagramaUmlIphoneApplication.class, args);
	}

}
