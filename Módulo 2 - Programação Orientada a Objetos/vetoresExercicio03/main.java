package vetoresExercicio03;

import java.util.Scanner;

public class main {

    // Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    // tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    // bem como os nomes dessas pessoas caso houver.

    static void main(String[] args) {

        int n, idade, menores = 0;
        double altura, soma = 0, mediaAltura, porcentagemMenores;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.println("Dados da " + (i+1) + "a pessoa");

            sc.nextLine(); // Limpando o buffer
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Idade: ");
            idade = sc.nextInt();

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

            if (idade < 16) {
                menores++;
            }

            soma = soma + altura;
        }

        porcentagemMenores = menores * 100 / n;

        mediaAltura = soma / n;
        System.out.println(" ");
        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porcentagemMenores);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}
