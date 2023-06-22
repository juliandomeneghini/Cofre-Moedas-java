package Cofre;

abstract class Moeda {
    private double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract void info();

    public abstract double converter();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getValor();
    }
}
