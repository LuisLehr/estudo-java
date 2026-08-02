package vetoresExercicio11;

import java.util.Scanner;

public class main {

    // Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
    // que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
    // de homens.

    static void main(String[] args) {

        int n, qtdHomens = 0, qtdMulheres = 0;
        char genero;
        double altura, maiorAltura = 0, menorAltura = 10, somaAlturasFemininas = 0, mediaAlturaFeminina;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas: ");
        n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Genero da " + (i+1) +"a pessoa (M/F): ");
            genero = sc.next().charAt(0);

            System.out.print("Altura da " + (i+1) +"a pessoa: ");
            altura = sc.nextDouble();

            pessoas[i] = new Pessoa(genero, altura);

            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i]. getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getGenero() == 'F') {
                qtdMulheres++;
                somaAlturasFemininas = somaAlturasFemininas + pessoas[i].getAltura();
            }

            else if (pessoas[i].getGenero() == 'M') {
                qtdHomens++;
            }
        }

        mediaAlturaFeminina = somaAlturasFemininas / qtdMulheres;

        System.out.println(" ");
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das alturas femininas: %.2f%n", mediaAlturaFeminina);
        System.out.println("Numero de homens: " + qtdHomens);
    }
}
