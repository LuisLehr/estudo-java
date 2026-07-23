package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaWhileExercicio02 {

    // Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
    //  cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
    //  menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 1, y = 1;

        while (x != 0 && y != 0) {

            System.out.print("Digite o primeiro número: ");
            x = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Q1");
            }

            else if (x > 0 && y < 0) {
                System.out.println("Q2");
            }

            else if (x < 0 && y > 0) {
                System.out.println("Q3");
            }

            else if (x < 0 && y < 0) {
                System.out.println("Q4");
            }
        }
    }
}
