package estruturaCondicional;

import java.util.Scanner;

public class exercicio03{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Os números " + num1 + " e " + num2 + " são multiplos!");
        }
        else {
            System.out.println("Os números " + num1 + " e " + num2 + " NÃO são multiplos!");
        }
    }
}
