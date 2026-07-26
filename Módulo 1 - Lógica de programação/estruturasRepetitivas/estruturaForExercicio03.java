package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaForExercicio03 {

    /* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
       de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
       conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
       peso 5
    */

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor1, valor2, valor3, media;
        int testes;

        System.out.print("Digite quantos testes quer fazer: ");
        testes = sc.nextInt();

        for (int i = 0; i < testes; i++) {
            System.out.print("Digite o primeiro valor: ");
            valor1 = sc.nextDouble();

            System.out.print("Digite o segundo valor: ");
            valor2 = sc.nextDouble();

            System.out.print("Digite o terceiro valor: ");
            valor3 = sc.nextDouble();

            media = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);

            System.out.printf("Média ponderada dos valores: %.1f%n",  media);
        }
    }
}
