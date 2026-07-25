package estruturasRepetitivas;

import java.util.Objects;
import java.util.Scanner;

public class estruturaDoWhile {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp, res;
        char continua;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            temp = sc.nextDouble();

            res = 9 * temp / 5 + 32;

            System.out.println(temp + " Celsius são " + res + " Fahreinheit");
            System.out.print("\n");
            System.out.print("Deseja fazer outra medição (s/n): ");
            continua = sc.next().charAt(0);
            System.out.println(" ");

        } while (continua == 's');

        System.out.println("Programa finalizado!");
    }
}
