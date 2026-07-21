package estruturaCondicional;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        double valor, total;

        System.out.print("Digite o código do produto (1 a 5): ");
        cod = sc.nextInt();
        System.out.print("Digite a quantia comprada: ");
        qtd = sc.nextInt();

        if (cod == 1) {
            valor = 4.00;
            total = qtd * valor;
            System.out.println("Valor total: R$ " + total);
        }
        else if (cod == 2) {
            valor = 4.50;
            total = qtd * valor;
            System.out.println("Valor total: R$ " + total);
        }
        else if (cod == 3) {
            valor = 5.00;
            total = qtd * valor;
            System.out.println("Valor total: R$ "  + total);
        }
        else if (cod == 4) {
            valor = 2.00;
            total = qtd * valor;
            System.out.println("Valor total: R$ " + total);
        }
        else if (cod == 5) {
            valor = 1.50;
            total = qtd * valor;
            System.out.println("Valor total: R$ " + total);
        }
        else {
            System.out.println("Código inválido!");
        }
    }
}
