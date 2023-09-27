package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaTest {

    @Test
    void TesteClone() throws CloneNotSupportedException {
        Carta carta = new Carta("Esqueleto", 50, 50, 100, 80);

        Carta cartaEvoluida = carta.clone();
        cartaEvoluida.setNome("Esqueleto Evoluído");
        cartaEvoluida.setAtaque(80);
        cartaEvoluida.setVelocidadeAtaque(100);

        assertEquals("Esqueleto: Ataque=50, Hp=50, Velocidade=100, Velocidade de ataque=80", carta.toString());
        assertEquals("Esqueleto Evoluído: Ataque=80, Hp=50, Velocidade=100, Velocidade de ataque=100", cartaEvoluida.toString());
    }
}