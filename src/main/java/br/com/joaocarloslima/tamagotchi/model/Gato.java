package br.com.joaocarloslima.tamagotchi.model;

public class Gato extends Animal {

    @Override
    public void brincar(){
        this.felicidade += 10;
        this.fome += 5;
        this.energia -= 5;
        limites();
    }

    @Override
    public void comer(){
        this.fome -= 15;
        this.energia += 10;
        limites();
    }

    @Override
    public void dormir(){
        this.energia += 20;
        this.fome += 5;
        limites();
    }

    @Override
    public void turno(){
        this.energia -= 5;
        this.fome += 5;
        this.felicidade -= 3;
        limites();
    }

}
