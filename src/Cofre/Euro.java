package Cofre;

class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Euro");
    }

    @Override
    public double converter() {
        // Converte o Euro em reais, baseado no euro do dia 20/06/2023
        return getValor() * 5.23; // Exemplo de conversão: 1 Euro = 5.23 Reais
    }
}
