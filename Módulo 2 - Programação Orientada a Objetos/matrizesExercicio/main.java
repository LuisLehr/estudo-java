package matrizesExercicio;

import java.util.List;
import java.util.Scanner;

public class main {

    // Fazer um programa para ler dois numero inteiros M e N, e depois ler uma matriz de M linhas por N colunas
    // Contendo numeros inteiros, podendo haver repeticao. Em seguida, ler um numero inteiro X que pertence a matriz
    // Para cada ocorrencia de X, mostrar os valores a esquerda, acima, a direita e abaixo de X, quando houver.

    static void main(String[] args) {

        int X, L, C;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas terá a Matriz: ");
        L = sc.nextInt();

        System.out.print("Quantas colunas terá a Matriz: ");
        C = sc.nextInt();

        Integer[][] matriz = new Integer[L][C];

        System.out.println("Digite a matriz abaixo:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c <matriz[l].length; c++){
                matriz[l][c] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Digite o valor a ser buscado: ");
        X = sc.nextInt();

        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                if (matriz[l][c] == X) {
                    System.out.println(l + ", " + c);

                    if (c - 1 >= 0 && matriz[l][c-1] != 0) {
                        System.out.println("A esquerda: " + matriz[l][c-1]);
                    }
                    if (l - 1 >= 0 && matriz[l-1][c] != 0) {
                        System.out.println("Acima: " + matriz[l-1][c]);
                    }
                    if (c + 1 < matriz[l].length) {
                        System.out.println("A direita: " + matriz[l][c+1]);
                    }
                    if (l + 1 < matriz.length) {
                        System.out.println("Abaixo: " + matriz[l+1][c]);
                    }
                }
            }
        }
    }
}
