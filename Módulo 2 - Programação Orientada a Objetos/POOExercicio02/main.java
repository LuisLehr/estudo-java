package POOExercicio02;

import java.util.Scanner;

public class main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;

        Empregado empregado = new Empregado();

        System.out.println("Digite os dados do empregado...");
        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();

        System.out.print("Salário bruto: ");
        empregado.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        empregado.imposto = sc.nextDouble();

        System.out.println(" ");
        System.out.print(empregado.toString());

        System.out.println(" ");
        System.out.print("Quantos porcento de aumento " + empregado.nome + " vai receber: ");
        valor = sc.nextDouble();

        empregado.aumentaSalario(valor);

        System.out.println("Funcionario atualizado: " + empregado.toString());
    }
}
