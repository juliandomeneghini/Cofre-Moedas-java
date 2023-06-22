package Cofre;

class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Dolar");
    }

    @Override
    public double converter() {
        // Converte o Dolar em reais, baseado no dolar do dia 20/06/2023
        return getValor() * 4.79; // Exemplo de conversão: 1 Dólar = 4.79 Reais
    }
}
