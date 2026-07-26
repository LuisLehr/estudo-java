package primeiroProblemaComPOO;

import java.util.Scanner;

public class main {

    static void main(String[] args) {

        double areax, areay;

        Scanner sc = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.print("Digite a primeira medida do Triangulo X: ");
        x.a = sc.nextDouble();
        System.out.print("Digite a segunda medida do Triangulo X: ");
        x.b = sc.nextDouble();
        System.out.print("Digite a terceira medida do Triangulo X: ");
        x.c = sc.nextDouble();

        System.out.print("Digite a primeira medida do Triangulo Y: ");
        y.a = sc.nextDouble();
        System.out.print("Digite a segunda medida do Triangulo Y: ");
        y.b = sc.nextDouble();
        System.out.print("Digite a terceira medida do Triangulo Y: ");
        y.c = sc.nextDouble();

        areax = x.calculaArea();
        areay = y.calculaArea();

        System.out.printf("O triangulo X possui area de: %.2f%n", areax);
        System.out.printf("O triangulo Y possui area de: %.2f%n", areay);

        if (areax > areay) {
            System.out.println("Maior área: Triangulo X");
        }

        else {
            System.out.println("Maior área: Triangulo Y");
        }

    }
}
