package matrizes;

import java.util.Scanner;

public class main {

    // Fazer um programa para ler um numero inteiro N e uma matriz de ordem N contendo numeros inteiros.
    // Em seguida, mostrar a diagonal principal e quantidade de valores negativos da matriz

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, numNegativos = 0;

        System.out.print("Qual o tamanho da matriz: ");
        n = sc.nextInt();

        // Criando uma matriz, um array bi dimensional, com N elementos em cada direção
        int[][] matriz = new int[n][n];

        System.out.println("Digite a matriz linha a linha: ");
        for (int x = 0; x < matriz.length; x++) { // Percorrendo as linhas
            for (int y = 0; y < matriz[x].length; y++) { // Percorrendo as colunhas
                matriz[x][y] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) { // Percorrendo as linhas
            System.out.print(matriz[i][i] + " "); // Imprimindo a diagonal principal da matriz (diagonal da esquerda para a direita)
        }

        System.out.println();

        // Se for negativo soma 1 no contador de numeros negativos
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] < 0) {
                    numNegativos++;
                }
            }
        }

        System.out.println("Numeros negativos: " + numNegativos);



    }
}
