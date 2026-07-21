package estruturaCondicional;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class exercicio01 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número inteiro positivo ou negativo: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("O número digitado é negativo!");
        }
        else {
            System.out.println("O número digitado é positivo!");
        }
    }
}
