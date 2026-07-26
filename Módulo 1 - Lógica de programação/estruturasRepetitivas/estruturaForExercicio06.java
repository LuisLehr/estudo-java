package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaForExercicio06 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("O número " + num + " é divisivel por: " + i);
            }
        }
    }
}
