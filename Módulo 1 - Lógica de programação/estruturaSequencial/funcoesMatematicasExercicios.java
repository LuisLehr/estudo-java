package estruturaSequencial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class funcoesMatematicasExercicios {

    public static void main(String[] args) {

        // Iniciando o scanner
        Scanner sc = new Scanner(System.in);

        // Exercicio 1
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        // mensagem explicativa, conforme exemplos.

        double n1, n2, res;
        System.out.println("Exercicio 1 - SOMA");
        System.out.print("Digite um número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número:");
        n2 = sc.nextDouble();

        res = n1+n2;

        System.out.println("SOMA = " + res);
        System.out.print("\n");


        // Exercicio 2
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        // casas decimais conforme exemplos
        // Considere o valor de π = 3.14159

        double pi;
        n1 = 0;
        pi = 3.14159;
        res = 0;
        System.out.println("Exercicio 2 - AREA DO CIRCULO");
        System.out.print("Digite o raio de um circulo: ");
        n1 = sc.nextDouble();

        res = pi * Math.pow(n1, 2);
        System.out.printf("AREA DO CIRCULO = %.4f%n", res);
        System.out.print("\n");


        // Exercicio 3
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        double a, b, c, d, dif;
        System.out.println("Exercicio 3 - DIFERENCA = (A * B - C * D)");
        System.out.print("Digite o primeiro número: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        b = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        c = sc.nextDouble();
        System.out.print("Digite o quarto número: ");
        d = sc.nextDouble();

        dif = a * b - c * d;
        System.out.print("\n");
        System.out.println("DIFERENCA = " + dif);


        // Exercicio 4
        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        // decimais.

        double numf, hrs, valorhora, total;

        System.out.println("Exercicio 4 - SALARIO DO FUNCIONARIO");
        System.out.print("Digite o número do cracha do funcionario: ");
        numf = sc.nextDouble();
        System.out.print("Digite quantas horas o funcionario trabalhou: ");
        hrs = sc.nextDouble();
        System.out.print("Digite o valor da hora do funcionario: ");
        valorhora = sc.nextDouble();
        System.out.print("\n");

        total = valorhora * hrs;

        System.out.println("Funcionario número: " + numf);
        System.out.println("Salario do funcionario: R$" + total);
        System.out.print("\n");

        // Exercicio 5
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        double cod1, cod2, num1, num2, preco1, preco2, precototal;
        System.out.println("Exercicio 5 - COMPRA DE PRODUTOS");
        System.out.print("Digite o código da peça 1: ");
        cod1 = sc.nextDouble();
        System.out.print("Digite o número de peças compradas: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o valor unitário da peça 1: ");
        preco1 = sc.nextDouble();

        System.out.println("\n");
        System.out.print("Digite o código da peça 2: ");
        cod2 = sc.nextDouble();
        System.out.print("Digite o número de peças compradas: ");
        num2 = sc.nextDouble();
        System.out.print("Digite o valor unitário da peça 2: ");
        preco2 = sc.nextDouble();

        precototal = preco1 * num1 +  preco2 * num2;

        System.out.println("Valor a pagar: R$" + precototal);
        System.out.println("\n");

        // Exercicio 6
        // Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        // mostre:
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B.

        double a1, a2, a3, area;
        System.out.println("Exercicio 6 - AREAS DIVERSAS");
        System.out.print("Digite o primeiro valor: ");
        a1 = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        a2 = sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        a3 = sc.nextDouble();

        area = a1 * a3 / 2;
        System.out.printf("TRIANGULO: %.2f%n", area);

        area = 0;

        area = pi * Math.pow(a3, 2);
        System.out.printf("CIRCULO: %.2f%n", area);

        area = 0;

        area = (a1+a2) * a3 / 2;
        System.out.printf("TRAPEZIO: %.2f%n", area);

        area = 0;

        area = Math.pow(a2, 2);
        System.out.printf("QUADRADO: %.2f%n", area);

        area = 0;

        area = a1 * a2;
        System.out.printf("RETANGULO: %.2f%n", area);
    }
}
