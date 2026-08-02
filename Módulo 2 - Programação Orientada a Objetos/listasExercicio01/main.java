package listasExercicio01;

import java.lang.classfile.attribute.EnclosingMethodAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    // Faça um programa para ler um numero inteiro N e depois os dados (id, nome, salario) de N funcionarios
    // Nao deve haver repeticao de id

    // Em seguida efetuar o aumento de X por cento no salario de um determinado funcionario.
    // Para isso o programa deve ler um id e o valor X, se o id informado nao existir, mostrar uma
    // mensagem e abortar a operacao. Ao final, mostrar a listagem atualizada dos funcionarios.

    static void main(String[] args) {

        int n, id;
        double x, salario, porcentagem = 0;
        String nome;

        List<Empregado> empregados = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios serão cadastrados: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Empregado " + (i+1) + "#:");

            System.out.print("ID: ");
            id = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Salario: ");
            salario = sc.nextDouble();

            empregados.add(new Empregado(id, nome, salario));
            System.out.println();
        }

        System.out.println();
        System.out.print("Digite o ID do cliente que receberá o aumento: ");
        id = sc.nextInt();

        // Iniciando o metodo criado com a lista e o id
        Integer pos = posicao(empregados, id);

        // Se retornar null (id nao existe na lista)
        if (pos == null) {
            System.out.println("Esse ID não existe"); // retorna mensagem de erro
        }
        // Caso ID exista le a porcentagem e chama o metodo de aumentar o salario passando a porcentagem que deve ser aumentada
        else {
            System.out.print("Digite a porcentagem: ");
            porcentagem = sc.nextDouble();
            empregados.get(pos).aumentaSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de empregados: ");
        for (Empregado emp : empregados){
            System.out.println(emp.toString());
        }

    }

    // Metodo que retorna o index caso o id exista na lista e retorna null caso o id nao exista na lista
    public static Integer posicao(List<Empregado> empregados, int id){
        for (int i = 0; i < empregados.size(); i++) {
            if (empregados.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }


}
