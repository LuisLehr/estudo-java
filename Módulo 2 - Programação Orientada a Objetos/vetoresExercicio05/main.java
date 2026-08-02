package vetoresExercicio05;

import java.util.Scanner;

public class main {

    // Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
    // o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
    // considerando a primeira posição como 0 (zero).

    static void main(String[] args) {

        int n, index = 0;
        double  maior = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        n = sc.nextInt();

        double[] numeros = new double[n];

        // Preenchendo o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                index = i;
            }
        }

        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Index do maior valor digitado: " + index);
    }

}
