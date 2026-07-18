package estruturaSequencial;

import java.util.Scanner;

public class entradaDeDados {

    static void main(String[] args) {

        // Iniciando o scanner para leitura de conteudo
        Scanner sc = new Scanner(System.in);

        // Iniciando variavel
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        // Imprimindo as variaveis
        System.out.println("Olá " + nome + " você tem " + idade + " anos!");
        sc.close();
    }
}
