package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaForExercicio05 {

    /* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
       Lembrando que, por definição, fatorial de 0 é 1.
    */

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, res = 1;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            res = res * i;
        }

        System.out.println("Fatorial: " + res);
    }
}