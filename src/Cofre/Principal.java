package Cofre;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao = -1;
        while (opcao != 0) {
        	//Exibe o menu com as opções
            System.out.println("\n----- Menu -----");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido");
            System.out.println("0. Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoeda(scanner, cofrinho);
                    break;
                case 2:
                    removerMoeda(scanner, cofrinho);
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                	// Converte todas moedas e mostra na tela o total convertido
                    double totalConvertido = cofrinho.totalConvertido();
                    System.out.println("Total convertido: R$" + totalConvertido);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
    // Exibe na tela pro usuário qual moeda deseja adicionar
    private static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\n----- Adicionar Moeda -----");
        System.out.println("1. Dolar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        System.out.print("Escolha o tipo de moeda: ");
        int tipoMoeda = scanner.nextInt();
        // Exibe na tela mensagem para digitar um valor pra moeda
        System.out.print("Digite o valor da moeda: ");
        double valorMoeda = scanner.nextDouble();

        Moeda moeda;
        switch (tipoMoeda) {
            case 1:
                moeda = new Dolar(valorMoeda);
                break;
            case 2:
                moeda = new Euro(valorMoeda);
                break;
            case 3:
                moeda = new Real(valorMoeda);
                break;
            default:
                System.out.println("Tipo de moeda inválido.");
                return;
        }

        cofrinho.adicionar(moeda);
    }
    // Exibe mensagem para remover a moeda e pergunta o valor para remover
    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\n----- Remover Moeda -----");
        System.out.print("Digite o valor da moeda a ser removida: ");
        double valorMoeda = scanner.nextDouble();

        Moeda moedaRemover = null;
        for (Moeda moeda : cofrinho.listaMoedas) {
            if (moeda.getValor() == valorMoeda) {
                moedaRemover = moeda;
                break;
            }
        }

        if (moedaRemover != null) {
            cofrinho.remover(moedaRemover);
        } else {
            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }
}
