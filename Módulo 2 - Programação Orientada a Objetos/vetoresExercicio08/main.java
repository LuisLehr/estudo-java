package vetoresExercicio08;

import java.util.Scanner;

public class main {

    // Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
    // ritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
    // digitado, mostrar a mensagem "NENHUM NUMERO PAR"

    static void main(String[] args) {

        int n, pares = 0, soma = 0;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos tera o vetor: ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0;  i < numeros.length; i ++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
                soma = soma + numeros[i];
            }
        }

        if (pares > 0) {
            media = soma / n;
            System.out.printf("Média dos pares: %.1f%n", media);
        }
        else {
            System.out.println("NENHUM NUMERO PAR DIGITADO");
        }
    }
}

