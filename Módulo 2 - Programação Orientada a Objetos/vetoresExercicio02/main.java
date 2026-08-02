package vetoresExercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    // Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    // - Imprimir todos os elementos do vetor
    // - Mostrar na tela a soma e a média dos elementos do vetor

    static void main(String[] args) {

        int n;
        double media, soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos número quer digitar: ");
        n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            soma = soma + numeros[i];
        }

        media = soma / numeros.length;

        // Imprimindo os valores do array
        System.out.println("Valores: " + Arrays.toString(numeros));
        System.out.println("Soma dos valores: " + soma);
        System.out.printf("Média: %.2f%n", media);
    }
}
