package Cofre;

import java.util.ArrayList;
import java.util.List;

class Cofrinho {
    List<Moeda> listaMoedas;

    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }
    // Exibe moeda e o valor unitário da moeda
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda adicionada: R$ " + moeda.toString());
    }
    // Remove a moeda selecionada do cofrinho e quando não encontra a moeda exibe mensagem
    public void remover(Moeda moeda) {
        if (listaMoedas.remove(moeda)) {
            System.out.println("Moeda removida: " + moeda.toString());
        } else {
            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }
    // Se a lista de moedas está vazia, exibe mensagem.
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:"); // Caso o cofrinho tenha moedas, ele lista as moedas e valores
            for (Moeda moeda : listaMoedas) {
                moeda.info();
                System.out.println("Valor: R$ " + moeda.getValor());
            }
        }
    }
    // Faz a conversão das moedas para real e faz a soma das moedas
    public double totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}
