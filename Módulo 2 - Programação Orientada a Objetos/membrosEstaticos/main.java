package membrosEstaticos;

import java.util.Scanner;

public class main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio;

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        // Quando se usa membros estaticos a classe não precisa ser instanciada antes, pode utilizar direto
        double c = Calculadora.circunferencia(raio);
        double v = Calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculadora.PI);
    }
}
