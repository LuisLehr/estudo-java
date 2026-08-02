package vetoresExercicio10;

import java.util.Scanner;

public class main {

    // Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
    // no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
    // os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
    // igual a 6.0 (seis).

    static void main(String[] args) {

        int n;
        double media = 6, nota1, nota2;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados: ");
        n = sc.nextInt();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            sc.nextLine(); // Limpando o buffer do enter
            System.out.print("Nome do aluno: ");
            nome = sc.nextLine();

            System.out.print("Nota do primeiro semestre: ");
            nota1 = sc.nextDouble();

            System.out.print("Nota do segundo semestre: ");
            nota2 = sc.nextDouble();

            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println(" ");
        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < alunos.length; i++) {
            if ((alunos[i].getNota1() + alunos[i].getNota2()) / 2 >= media) {
                System.out.println(alunos[i].getNome());
            }
        }
    }
}
