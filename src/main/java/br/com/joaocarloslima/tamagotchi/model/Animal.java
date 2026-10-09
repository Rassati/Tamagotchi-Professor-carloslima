package br.com.joaocarloslima.tamagotchi.model;

public abstract class Animal {
    protected int felicidade = 50;
    protected int fome = 50;
    protected int energia = 50;
    private int MAXIMO_VALOR = 100;
    private int MINIMO_VALOR = 0;

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
        if (energia <= MINIMO_VALOR) {
            energia = MINIMO_VALOR;
        } else if (energia >= MAXIMO_VALOR) {
            energia = MAXIMO_VALOR;
        }

        if (fome <= MINIMO_VALOR) {
            fome = MINIMO_VALOR;
        } else if (fome >= MAXIMO_VALOR) {
            fome = MAXIMO_VALOR;
        }

        if (felicidade <= MINIMO_VALOR) {
            felicidade = MINIMO_VALOR;
        } else if (felicidade >= MAXIMO_VALOR) {
            felicidade = MAXIMO_VALOR;
        }
    }

}
