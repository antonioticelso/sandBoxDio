package com.github.antonioticelso.diagramaUmlIphone.model;

public class AparelhoTelefonico {

    //    ligar, atender, correioVoz
    public void getCall(long numbers) {
        String call = String.valueOf(numbers);
        if (call.length() > 8) {
            System.out.println("Ligando para: " + numbers);
        } else {
            System.out.println("Ligação não pode ser completada!");
        }

    }

    public void getAtender(boolean aceitar) {
        if (aceitar) {
            System.out.println("Ligação aceita");
        } else {
            getPostCard();
        }
    }

    private void getPostCard() {
        System.out.println("Ligação direcionada para caixa de voz.");
    }

}
