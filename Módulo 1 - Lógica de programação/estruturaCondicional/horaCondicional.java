package estruturaCondicional;

import java.util.Scanner;

public class horaCondicional {

    static void main(String[] args) {

        // Iniciando o Scanner
        Scanner sc = new Scanner(System.in);

        // Iniciando a variavel
        int hora;

        // Perguntando e lendo a hora para o usuario
        System.out.print("Que horas são (Digite somente números inteiros): ");
        hora = sc.nextInt();

        System.out.println(" ");

        // Exibindo a mensagem conforme a hora
        if (hora < 12) {
            System.out.println("Bom Dia!");
        }
        else if (hora < 18) {
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println("Boa Noite!");
        }
    }
}
