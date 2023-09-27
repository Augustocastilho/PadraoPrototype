package org.example;

public class Carta implements Cloneable{

    private String nome;
    private int hp;
    private int ataque;
    private int velocidade;
    private int velocidadeAtaque;

    public Carta(String nome, int hp, int ataque, int velocidade, int velocidadeAtaque) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.velocidade = velocidade;
        this.velocidadeAtaque = velocidadeAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(int velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }

    @Override
    public Carta clone() throws CloneNotSupportedException {
        Carta cartaClone = (Carta) super.clone();
        return cartaClone;
    }

    @Override
    public String toString(){
        return nome + ": Ataque=" + ataque +
                ", Hp=" + hp +
                ", Velocidade=" + velocidade +
                ", Velocidade de ataque=" + velocidadeAtaque;
    }

}
