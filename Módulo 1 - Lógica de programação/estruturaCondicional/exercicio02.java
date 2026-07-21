package estruturaCondicional;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero inteiro: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número digitado é par!");
        }
        else {
            System.out.println("O número digitado é impar!");
        }


    }

}
