package org.example;

public class VelocidadeAdapter extends QuilometrosPorHora {

    private IVelocidade percepcaoDeVelocidade;

    public VelocidadeAdapter(IVelocidade percepcaoDeVelocidade) {
        this.percepcaoDeVelocidade = percepcaoDeVelocidade;
    }

    public String recuperarVelocidade() {
        if (this.getVelocidadeKmPorH() < 40)
            percepcaoDeVelocidade.setVelocidade("Lenta");
        else if (this.getVelocidadeKmPorH() < 80)
            percepcaoDeVelocidade.setVelocidade("Média");
        else if (this.getVelocidadeKmPorH() < 120)
            percepcaoDeVelocidade.setVelocidade("Rápida");
        else
            percepcaoDeVelocidade.setVelocidade("Muito Rápida");

        return percepcaoDeVelocidade.getVelocidade();
    }

    public void salvarVelocidade() {
        if (percepcaoDeVelocidade.getVelocidade().equals("Lenta"))
            this.setVelocidadeKmPorH(30);
        else if (percepcaoDeVelocidade.getVelocidade().equals("Média"))
            this.setVelocidadeKmPorH(70);
        else if (percepcaoDeVelocidade.getVelocidade().equals("Rápida"))
            this.setVelocidadeKmPorH(110);
        else
            this.setVelocidadeKmPorH(150);
    }
}
