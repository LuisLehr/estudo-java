package funcoesExtrasJava;

import java.util.Scanner;

public class sintaxeDasFuncoes {


    // Criando uma função que exibe o numero mais alto entre 3 digitados
    public static int valorMaisAlto(int n1, int n2, int n3){
        int res;

        if (n1 > n2 && n1 > n3) {
            res = n1;
        }

        else if (n2 > n3) {
            res = n2;
        }

        else {
            res = n3;
        }

        return res;
    }

    // Criando uma funcao que exibe um valor
    public static void showResult(int valor){
        System.out.println("Valor mais alto digitado : " + valor);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declarando as variaveis
        int n1, n2, n3;

        // Lendo os valores
        System.out.print("Digite o primeiro numero: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        n3 = sc.nextInt();

        // Armazenando o resultado da funcao valor mais alto em uma variavel "maisAlto"
        int maisAlto = valorMaisAlto(n1, n2, n3);

        // Chamando a função que exibe um resultado
        showResult(maisAlto);
    }
}
