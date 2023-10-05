package org.example;

public class Veiculo {

    IVelocidade percepcaoDeVelocidade;

    VelocidadeAdapter persistencia;

    public Veiculo() {
        percepcaoDeVelocidade = new Percepcao();
        persistencia = new VelocidadeAdapter(percepcaoDeVelocidade);
    }

    public void setVelocidade(String velocidade) {
        percepcaoDeVelocidade.setVelocidade(velocidade);
        persistencia.salvarVelocidade();
    }

    public String getVelocidade() {
        return persistencia.recuperarVelocidade();
    }

    public int getVelocidadeKmPorH() {
        return persistencia.getVelocidadeKmPorH();
    }

}
