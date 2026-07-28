package TerceiroProblemaComPOO;

import java.util.Scanner;

public class main {

    static void main(String[] args) {

        // Iniciando o Scanner
        Scanner sc = new Scanner(System.in);
        Conta conta;

        // Iniciando variaveis locais
        int numeroConta;
        String nomeCliente, deposito = "n";
        double saldo, valor;

        // Iniciado as leituras dos valores
        System.out.println("SISTEMA BANCARIO!");
        System.out.print("Digite o número da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        nomeCliente = sc.nextLine();

        System.out.print("Deposito inicial (s/n): ");
        deposito = sc.nextLine();

        // Verifica se tera deposito inicial ou não
        if (deposito.equals("s")) {
            System.out.print("Digite o valor do deposito inicial: ");
            saldo = sc.next().charAt(0);

            // Chamando o construtor com os dados passados
            conta = new Conta(numeroConta, nomeCliente, saldo);
        }

        else {
            conta = new Conta(numeroConta, nomeCliente);
        }

        // Exibindo os dados da conta
        System.out.println("\nInformações da conta:");
        System.out.println(conta.toString());

        // Fazendo um sepoito
        System.out.print("\nDigite um valor para depósito: ");
        valor = sc.nextDouble();
        conta.deposito(valor);

        // Exibindo os dados da conta atualizados
        System.out.println("\nDados da conta atualizados:");
        System.out.println(conta.toString());

        // Fazendo um saque
        System.out.printf("\nDigite um valor para saque: ");
        valor = sc.nextDouble();
        conta.saque(valor);

        // Exibindo os dados da conta atualizados
        System.out.println("\nDados da conta atualizados:");
        System.out.println(conta.toString());
    }
}

