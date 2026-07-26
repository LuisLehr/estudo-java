package POOExercicio03;

import java.util.Scanner;

public class main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("CALCULADORA DE NOTA FINAL!");
        System.out.print("Digite a nota do primeiro trimestre: ");
        aluno.t1 = sc.nextDouble();

        System.out.print("Digite a nota do segundo trimestre: ");
        aluno.t2 = sc.nextDouble();

        System.out.print("Digite a nota do terceiro trimestre: ");
        aluno.t3 = sc.nextDouble();

        if (aluno.notaFinal() > 60) {
            System.out.println(" ");
            System.out.println("APROVADO!");
            System.out.println("Nota final: " + aluno.notaFinal());
        }

        else {
            System.out.println(" ");
            System.out.println("REPROVADO!");
            System.out.println("Nota: " + aluno.notaFinal());
            System.out.println("Pontos faltantes: "+ aluno.pontosFaltando());
        }
    }
}
