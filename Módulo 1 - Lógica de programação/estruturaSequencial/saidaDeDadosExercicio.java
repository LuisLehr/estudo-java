package estruturaSequencial;

import java.util.Locale;

public class saidaDeDadosExercicio {

    static void main() {

        // Iniciando as variaveis
        String produto1 = "Computador";
        String produto2 = "Notebook";
        int idade = 23;
        int codigo = 5290;
        char genero = 'M';
        double valor1 = 2100.0;
        double valor2 = 650.50;
        double medida = 53.234567;

        // Saídas
        System.out.println("Produtos:");
        System.out.printf("%s, custa R$%.2f\n", produto1, valor1);
        System.out.printf("%s custa R$%.2f\n\n", produto2, valor2);
        System.out.printf("Record: %d anos de idade, código: %d, genero: %s\n\n", idade, codigo, genero);
        System.out.printf("Medida com oito casas decimais: %.8f\n", medida);
        System.out.printf("Arredondado para 3 casas decimais: %.3f\n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Padrão americano: %.3f\n", medida);

    }
}
