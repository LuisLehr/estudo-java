package estruturaCondicional;

import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        y = sc.nextDouble();

        if (x == 0 &&  y == 0) {
            System.out.println("Você está na origem!");
        }
        else if (x == 0) {
            System.out.println("Você está no eixo X!");
        }
        else if (y == 0) {
            System.out.println("Você está no eixo Y!");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }
}
