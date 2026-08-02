package vetoresExercicio04;

import java.util.Scanner;

public class main {

    // Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
    // tela todos os números pares, e também a quantidade de números pares.

    static void main(String[] args) {

        int n, pares = 0;

        Scanner sc= new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados: ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 ==0) {
                System.out.printf("%d  ", numeros[i]);
                pares++;
            }
        }
        System.out.println("\n\nQuantidade de pares: " + pares);
    }
}
