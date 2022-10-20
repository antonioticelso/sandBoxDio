package com.github.antonioticelso.diagramaUmlIphone.model;

public class AparelhoInternet {

    int numberPage = 0;

    public void getAddPage() {
        if (numberPage == 0) {
            getReadPage();
            numberPage++;
        } else {
            System.out.println("Nova página " + numberPage);
            getReadPage();
            numberPage++;
        }
    }

    public void getUpPage(int numbers) {
        if (numbers <= numberPage) {
            System.out.println("Atualizando página: " + numbers);
        } else {
            System.out.println("Página: " + numbers + " não existe!");
        }
    }

    private void getReadPage() {
        System.out.println("Iniciando página!");
    }

}
