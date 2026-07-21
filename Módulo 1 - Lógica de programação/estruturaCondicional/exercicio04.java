package estruturaCondicional;

import java.util.Scanner;

public class exercicio04 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h1, h2, res;

        System.out.print("Digite a hora que o jogo começou: ");
        h1 = sc.nextInt();
        System.out.print("Digite a hora que o jogo terminou: ");
        h2 = sc.nextInt();

        if (h1 == h2) {
            System.out.println("O jogo durou 24 horas!");
        }

        else if (h1 < h2) {
            res = h2 - h1;
            System.out.println("O jogo durou " + res + " horas!");
        }

        else {
            res = 24 - h1 + h2;
            System.out.println("O jogo durou " + res + " horas!");
        }

    }
}
