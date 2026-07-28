package segundoProblemaEstoque;

import java.util.Locale;
import java.util.Scanner;

public class main {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com os dados do produto:\n");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: R$");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println(" ");
        System.out.println(produto.toString());
        System.out.println(" ");

        System.out.print("Quantos produtos deseja adicionar ao estoque: ");
        quantidade = sc.nextInt();
        produto.addProduto(quantidade);

        System.out.println(" ");
        System.out.println("Estoque atualizado:");
        System.out.println(produto.toString());
        System.out.println(" ");

        System.out.print("Quantos produtos deseja remover ao estoque: ");
        quantidade = sc.nextInt();
        produto.removeProduto(quantidade);

        System.out.println(" ");
        System.out.println("Estoque atualizado:");
        System.out.println(produto.toString());
        System.out.println(" ");
    }
}
