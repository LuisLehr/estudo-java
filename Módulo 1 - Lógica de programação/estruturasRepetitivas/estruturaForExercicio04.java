package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaForExercicio04 {

    /* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
       segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
    */

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, res;
        int qtd;

        System.out.print("Digite quantas divisões quer fazer: ");
        qtd = sc.nextInt();
        System.out.print("\n");

        for (int i = 0; i < qtd; i++) {
            System.out.print("Primeiro valor: ");
            n1 = sc.nextDouble();

            System.out.print("Segundo valor: ");
            n2 = sc.nextDouble();

            if (n2 == 0) {
                System.out.println("Divisão Impossível!");
            }

            else {
                res = n1 / n2;
                System.out.printf("Resultado da divisão: %.2f%n", res);
            }
        }
    }
}
