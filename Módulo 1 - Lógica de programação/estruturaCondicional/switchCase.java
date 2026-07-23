package estruturaCondicional;

import java.util.Scanner;

public class switchCase {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia;

        System.out.print("Digite o dia em inteiros: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}
