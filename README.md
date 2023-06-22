# Cofrinho de Moedas em Java

Este é um pequeno sistema em Java que emula um "Cofrinho de moedas". O objetivo do trabalho é implementar o conceito de herança e polimorfismo, fornecendo ao usuário um menu com as seguintes opções:

1. Adicionar moedas de diferentes valores e países ao cofrinho: Permite ao usuário adicionar moedas de diferentes valores e países ao cofrinho. As moedas podem ser do tipo Dólar, Euro, Real, ou qualquer outra moeda específica.

2. Remover moedas específicas do cofrinho: Permite ao usuário remover moedas específicas do cofrinho, informando o valor e o país da moeda a ser removida.

3. Listar todas as moedas no cofrinho: Exibe uma lista de todas as moedas presentes no cofrinho, mostrando seu valor e país correspondente.

4. Calcular o valor total do cofrinho em Real: Realiza o cálculo do valor total do cofrinho convertido para a moeda Real.

# Diagrama UML

## O projeto deve conter as seguintes classes:

* Cofrinho: Classe responsável por representar o cofrinho e gerenciar a coleção de moedas. Possui um atributo que é uma coleção de moedas (por exemplo, um ArrayList) e métodos para adicionar, remover e calcular o valor total do cofrinho em Real.

* Moeda: Classe mãe abstrata que define as características básicas de uma moeda, como valor e país. Serve como base para as classes específicas de cada tipo de moeda.

* Dolar: Classe específica que herda da classe Moeda e representa uma moeda do tipo Dólar. Pode possuir atributos ou métodos adicionais, conforme necessário.

* Euro: Classe específica que herda da classe Moeda e representa uma moeda do tipo Euro. Também pode possuir atributos ou métodos adicionais, se necessário.

* Real: Classe específica que herda da classe Moeda e representa uma moeda do tipo Real. Da mesma forma, pode possuir atributos ou métodos extras, caso seja preciso.

Você tem a liberdade de adicionar classes extras, métodos e atributos conforme julgar necessário para implementar o sistema.

## Implementação

A implementação do projeto deve seguir os conceitos de herança e polimorfismo, garantindo que as classes filhas (Dolar, Euro, Real, etc.) herdem os atributos e métodos da classe mãe (Moeda).

Além disso, a classe Cofrinho deve ser responsável por gerenciar a coleção de moedas, utilizando uma estrutura de dados adequada, como um ArrayList, para armazenar as moedas adicionadas pelo usuário.

Os detalhes específicos de implementação, como a interação com o usuário e a exibição dos resultados, podem ser adaptados de acordo com a preferência do aluno.

Sinta-se à vontade para personalizar o projeto e adicionar qualquer outra funcionalidade que julgue relevante.

Observação: Este arquivo README fornece apenas uma estrutura básica para o projeto. É recomendado que você forneça informações adicionais, como instruções de compilação e execução do projeto, exemplos de uso e outras informações relevantes para auxiliar no entendimento e na utilização do sistema.
