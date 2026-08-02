package vetoresExercicio09;

import java.util.Scanner;

public class main {

    // Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
    // devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
    // da pessoa mais velha.

    static void main(String[] args) {

        String nome;
        int n ,idade, indexMaisVelho = 0, maisVelho = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar: ");
        n = sc.nextInt();

        Pessoa[] nomes = new Pessoa[n];
        Pessoa[] idades = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Limpando o buffer do Enter
            System.out.print("Nome da pessoa: ");
            nome = sc.nextLine();

            System.out.print("Idade da pessoa: ");
            idade = sc.nextInt();

            nomes[i] = new Pessoa(nome);
            idades[i]= new Pessoa(idade);

            if (idades[i].getIdade() > maisVelho) {
                maisVelho = idades[i].getIdade();
                indexMaisVelho = i;
            }
        }

        System.out.println(" ");
        System.out.println("Pessoa mais velha: " + nomes[indexMaisVelho].getNome());

    }
}
