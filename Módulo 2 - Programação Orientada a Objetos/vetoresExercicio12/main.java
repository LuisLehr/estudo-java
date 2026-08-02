package vetoresExercicio12;

import java.util.Scanner;

public class main {

    // A dona de uma pensao possui 10 quartos para alugar para estudantes, sendo esses quartos identificados
    // pelos numeros de 0 a 9.
    // Faça um programa que inicie com todos os 10 quartos vazios e depois leia uma quantidade N representando
    // o numero de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o alguel dos N
    // estudantes, bem como qual dos quartos ele escolheu (0 a 9). Suponha  que seja escolhido um quarto vago.
    // ao final o programa deve imprimir um relatorio de todas as ocupaçoes do pensionato, por ordem de quarto.

    static void main(String[] args) {

        int n, quarto;
        String nome, email;

        Quartos[] quartos = new Quartos[10];

        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos quartos serão alugados: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Alguel " + (i+1) + "#:");

            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Quarto (0 a 9): ");
            quarto = sc.nextInt();

            quartos[quarto] = new Quartos(quarto, nome, email);
        }

        System.out.println(" ");
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i].toString());
            }
        }
    }
}
