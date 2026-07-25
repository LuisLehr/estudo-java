package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaFor {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtd = 0;
        int soma = 0;
        int num = 0;

        System.out.print("Quantos numeros que somar: ");
        qtd = sc.nextInt();

        for (int i=0; i < qtd; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma = soma + num;
        }

        System.out.println("Soma dos números digitados: " + soma);
    }
}
