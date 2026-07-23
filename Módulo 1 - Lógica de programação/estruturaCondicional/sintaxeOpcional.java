package estruturaCondicional;


import java.util.Locale;
import java.util.Scanner;

public class sintaxeOpcional {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double hora, valor;
        valor = 50;

        System.out.print("Digite quantas hora usou o plano: ");
        hora = sc.nextDouble();


        // Uso de sintaxe opcional para facilitar as contas
        // valor + valor = x        valor += x
        // valor - valor = x        valor -= x
        // valor * valor = x        valor *= x
        // valor / valor = x        valor /= x
        // valor % valor = x        valor %= x
        if (hora > 100) {
            valor += (hora - 100) * 2;
        }

        System.out.printf("Valor da conta: R$ %.2f%n", valor);

    }
}
