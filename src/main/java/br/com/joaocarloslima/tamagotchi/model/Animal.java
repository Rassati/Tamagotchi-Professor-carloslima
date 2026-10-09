package br.com.joaocarloslima.tamagotchi.model;

public abstract class Animal {
    protected int felicidade = 50;
    protected int fome = 50;
    protected int energia = 50;

    public int getFome() { return fome; }

    public int getEnergia() {
        return energia;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public abstract void brincar();

    public abstract void comer();

    public abstract void dormir();

    public abstract void turno();

    public void limites() {
        if (energia <= 0) {
            energia = 0;
        } else if (energia >= 100) {
            energia = 100;
        }

        if (fome <= 0) {
            fome = 0;
        } else if (fome >= 100) {
            fome = 100;
        }

        if (felicidade <= 0) {
            felicidade = 0;
        } else if (felicidade >= 100) {
            felicidade = 100;
        }
    }

}
