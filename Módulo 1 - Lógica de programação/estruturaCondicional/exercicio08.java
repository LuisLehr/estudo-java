package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.print("Digite seu salário: ");
        salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        }
        else if (salario > 2000 && salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("Imposto a pagar: %.2f\n", imposto);
        }
        else if (salario > 3000 && salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000  * 0.08;
            System.out.printf("Imposto a pagar: %.2f\n", imposto);
        }
        else if (salario > 4500) {
            imposto = (salario - 4500) * 0.28 + 1500  * 0.18 + 1000 * 0.08;
            System.out.printf("Imposto a pagar: %.2f\n", imposto);
        }
    }
}
