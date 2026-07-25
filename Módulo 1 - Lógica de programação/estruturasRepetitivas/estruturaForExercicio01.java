package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaForExercicio01 {

    // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    // X, se for o caso.

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        System.out.print("Digite um número: ");
        x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
