package estruturaSequencial;

import java.util.Locale;

public class saidaDeDados {

    static void main(String[] args) {

        // Atribuindo valor a uma variável
        double x = 10.3456;

        // Imprimindo o valor da variável
        System.out.println(x);

        // Imprimindo o valor com duas casas após a virgula
        System.out.printf("%.2f\n", x);

        // Imprimindo o valor com 4 casas após a virgula
        System.out.printf("%.4f\n", x);

        // Definindo o Locale como US (USA) assim o printf ira sair com ponto ao invés de virgula
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", x);

        // Concatenando escrita e valores
        System.out.println("O valor de X é: " + x + "!");

        // Concatenando escrita e valores com Printf
        System.out.printf("O valor de X é: %.2f!%n", x);

        // Atribuindo valores a novas variáveis
        String nome = "Luis";
        int idade = 23;
        double salario = 3500.00;

        // Concatenando várias variaveis na mesma string
        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, salario);


    }
}
