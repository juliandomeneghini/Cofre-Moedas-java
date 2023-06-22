package Cofre;

class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Real");
    }

    @Override
    public double converter() {
        return getValor();
    }
}
