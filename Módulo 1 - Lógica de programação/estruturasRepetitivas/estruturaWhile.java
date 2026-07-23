package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaWhile {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 1;
        int soma = 0;

        while (num != 0) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma = soma + num;
        }

        System.out.println("A soma dos números digitados foi: " + soma);
    }
}
