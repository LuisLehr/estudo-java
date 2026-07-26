package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaForExercicio02 {

    /* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
       Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
       essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
    */


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtd, num, in = 0, out = 0;

        System.out.print("Quantos números quer digitar: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Número: ");
            num = sc.nextInt();

            if (num < 10 || num > 20) {
                out++;
            }
            else {
                in++;
            }
        }

        System.out.println("In: " + in);
        System.out.println("Out: " + out);
    }
}
