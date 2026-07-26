package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaForExercicio07 {

    /* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
       começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
       exemplo.
    */

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, pow2, pow3;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i + " " + Math.powExact(i , 2) + " " + Math.powExact(i , 3));
        }
    }
}
