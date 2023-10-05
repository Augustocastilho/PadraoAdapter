package org.example;

public class Percepcao implements IVelocidade {

    private String PercepcaoVelocidadeMaxima;

    @Override
    public String getVelocidade() {
        return this.PercepcaoVelocidadeMaxima;

    }

    @Override
    public void setVelocidade(String velocidade) {
        this.PercepcaoVelocidadeMaxima = velocidade;

    }
}
