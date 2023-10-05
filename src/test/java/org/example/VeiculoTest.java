package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VeiculoTest {

    @Test
    void deveRetornarVelocidadePorPercepcao() {
        Veiculo veiculo = new Veiculo();
        veiculo.setVelocidade("Rápida");
        assertEquals("Rápida", veiculo.getVelocidade());
    }

    @Test
    void deveRetornarVelocidadeKmPorH() {
        Veiculo veiculo = new Veiculo();
        veiculo.setVelocidade("Rápida");
        assertEquals(110, veiculo.getVelocidadeKmPorH());
    }

}