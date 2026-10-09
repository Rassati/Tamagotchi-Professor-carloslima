package br.com.joaocarloslima.tamagotchi.model;

public class Dragao extends Animal {

    @Override
    public void brincar(){
        this.felicidade += 12;
        this.fome += 15;
        this.energia -= 15;
        limites();
    }

    @Override
    public void comer(){
        this.fome -= 30;
        this.energia += 20;
        limites();
    }

    @Override
    public void dormir(){
        this.energia += 10;
        this.fome += 10;
        limites();
    }

    @Override
    public void turno(){
        this.energia -= 15;
        this.fome += 10;
        this.felicidade -= 7;
        limites();
    }

}