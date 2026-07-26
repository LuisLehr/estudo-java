package POOExercicio01;

import java.util.Scanner;

public class main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.println(" ");
        System.out.println(retangulo.toString());
    }
}
