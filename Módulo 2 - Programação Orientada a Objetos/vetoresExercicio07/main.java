package vetoresExercicio07;

import java.util.Scanner;

public class main {

    // Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    // mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    // os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

    static void main(String[] args) {

        int n;
        double media, soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos tera o vetor: ");
        n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            soma = soma + numeros[i];
        }

        media = soma / n;

        System.out.println(" ");
        System.out.printf("Média do vetor: %.2f%n", media);
        System.out.println(" ");

        System.out.println("Números abaixo da média: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }
    }
}
