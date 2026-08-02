package vetores;

import java.util.Scanner;

public class mediaDeAltura {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0, media;

        System.out.print("Digite quantas alturas quer digitar: ");
        n = sc.nextInt();

        // Iniciando um array que ira armazenar as alturas
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite a altura: ");
            alturas[i] = sc.nextDouble();
        }

        System.out.println("Leitura completa!");

        for (int i = 0; i < n; i++){
            soma = soma + alturas[i];
        }

        media = soma / n;
        System.out.printf("A média das alturas digitadas é: %.2f%n", media);
    }
}
