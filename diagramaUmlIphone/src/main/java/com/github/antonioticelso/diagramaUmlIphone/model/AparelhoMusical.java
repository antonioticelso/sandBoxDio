package com.github.antonioticelso.diagramaUmlIphone.model;

public class AparelhoMusical {

    boolean stop = false;
    boolean pauser = false;

    public void getPlay() {
        System.out.println("Tocando música escolhida!");
    }

    public void getPause() {
        if (!pauser) {
            System.out.println("Pausou a música!");
            pauser = true;
        } else {
            System.out.println("Continuando música de onde pausou!");
            pauser = false;
        }
    }

    public void getStop() {
        if (!pauser) {
            System.out.println("Stop!");
            stop = true;
        } else {
            getPlay();
            System.out.println("Iniciando música!");
            stop = false;
        }
    }

    public void getSelect() {
        System.out.println("Selecione a música desejada!");
        getPlay();
    }

}
