package vetoresDeClasses;

import java.util.Scanner;

public class mediaDeValor {

    static void main(String[] args) {

        int n;
        String nome;
        double soma = 0, media, preco;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos produtos quer Cadastrar: ");
        n = sc.nextInt();

        // Iniciando um array de produtos
        Produto[] produtos = new Produto[n];

        // Cadastrando os produtos
        for (int i = 0; i < produtos.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            nome = sc.nextLine();

            System.out.print("Digite o valor do produto: ");
            preco = sc.nextDouble();

            // Criando produto no vetor i com os dados passados
            produtos[i] = new Produto(nome, preco);

            System.out.println("--------------------------");
        }

        for (int i = 0; i < produtos.length; i++){
            soma = soma + produtos[i].getValor();
        }

        media = soma / produtos.length;

        System.out.printf("A media de valor dos produtos cadastrados é: %.2f%n", media);




    }

}
