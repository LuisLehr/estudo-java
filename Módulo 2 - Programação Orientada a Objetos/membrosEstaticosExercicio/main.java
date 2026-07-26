package membrosEstaticosExercicio;

import java.util.Scanner;

public class main {

    static void main(String[] args) {

        double preco, qtd;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preco do dolar: ");
        preco = sc.nextDouble();

        System.out.print("Quantos dólares deseja comprar: ");
        qtd = sc.nextDouble();

        System.out.printf("Valor a ser pago: %.2f%n", Conversor.converteDolar(preco, qtd));
    }
}
