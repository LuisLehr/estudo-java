package vetoresExercicio06;

import java.util.Scanner;

public class main {

    // Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
    // terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
    // o vetor C gerado.

    static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros tera cada vetor: ");
        n = sc.nextInt();

        int[] numeros1 = new int[n];
        int[] numeros2 = new int[n];
        int[] resultante = new int[n];

        for (int i = 0; i < numeros1.length; i++) {
            System.out.print("Digite os valores do vetor 1: ");
            numeros1[i] = sc.nextInt();
        }

        System.out.println(" ");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print("Digite os valores do vetor 2: ");
            numeros2[i] = sc.nextInt();
        }

        for (int i = 0; i < resultante.length; i++) {
            resultante[i] = numeros1[i] + numeros2[i];
        }

        System.out.println(" ");
        System.out.println("Vetor resultante: ");
        for (int i = 0; i < resultante.length; i++) {
            System.out.println(resultante[i]);
        }
    }
}
