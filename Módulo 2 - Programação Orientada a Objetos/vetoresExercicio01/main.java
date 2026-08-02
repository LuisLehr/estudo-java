package vetoresExercicio01;

import java.util.Scanner;

public class main {

    // Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    // e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Digite quantos numeros quer digitar (max 10): ");
        n = sc.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while (n < 0 || n > 10) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Digite quantos numeros quer digitar (max 10): ");
            n = sc.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Número negativos digitados:");

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
