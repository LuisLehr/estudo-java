package estruturaCondicional;

import java.util.Scanner;

public class exercicio06 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;

        System.out.print("Digite um numero: ");
        num = sc.nextDouble();

        if  (num >= 0 && num <= 25) {
            System.out.println("O número " + num + " se encontra no intervalo 0 - 25");
        }
        else if (num >= 25.01 && num <= 50) {
            System.out.println("O número " + num + " se encontra no intervalo 25 - 50");
        }
        else if (num >= 50.01 && num <= 75) {
            System.out.println("O número " + num + " se encontra no intervalo 50 - 75");
        }
        else if (num >= 75.01 && num <= 100) {
            System.out.println("O número " + num + " se encontra no intervalo 75 - 100");
        }
        else {
            System.out.println("O número " + num + " não se encontra nos intervalos cadastrados!");
        }
    }
}
