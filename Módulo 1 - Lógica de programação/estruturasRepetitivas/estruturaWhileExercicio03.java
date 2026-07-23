package estruturasRepetitivas;

import java.util.Scanner;

public class estruturaWhileExercicio03 {

    // Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
    // um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
    // 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
    // que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
    // mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
    // exemplo.

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalClientes = 0;
        int total = 0;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        int codigo = 1;

        System.out.println("");
        System.out.println("SISTEMA DE POSTO DE GASOLINA");

        while (codigo != 4) {

            System.out.println("");
            System.out.println("Digite o código do combustível abastecido!");
            System.out.println("1 - Álcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            System.out.println("4 - Sair");
            System.out.print("Código: ");
            codigo = sc.nextInt();

            while (codigo < 1 || codigo > 4) {
                System.out.println("");
                System.out.println("Digite um código válido!");
                System.out.println("Digite o código do combustível abastecido!");
                System.out.println("1 - Álcool");
                System.out.println("2 - Gasolina");
                System.out.println("3 - Diesel");
                System.out.println("4 - Sair");
                System.out.print("Código: ");
                codigo = sc.nextInt();
            }

            if (codigo == 1) {
                alcool = alcool + 1;
                totalClientes = totalClientes + 1;
            }

            if (codigo == 2) {
                gasolina = gasolina + 1;
                totalClientes = totalClientes + 1;
            }

            if (codigo == 3) {
                diesel = diesel + 1;
                totalClientes = totalClientes + 1;
            }

            if (codigo == 4) {
                break;
            }
        }

        System.out.println("\nRESUMO DE CLIENTES");
        System.out.println("Total de clientes: " + totalClientes);
        System.out.println("Alcóol: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
