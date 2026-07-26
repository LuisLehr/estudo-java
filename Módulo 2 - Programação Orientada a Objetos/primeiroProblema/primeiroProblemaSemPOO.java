package primeiroProblema;

import java.util.Scanner;

public class primeiroProblemaSemPOO {

    // RESOLVENDO UM PROBLEMA SEM USAR POO

    /* Fazer um programa para ler as medidas dos lados de dois Triangulos X e Y (Suponha medidas válidas).
       Em seguida, mostrar o valor das áreas dos dois triangulos e dizer qual dos dois triangulos possui a maior area.

       A formula para calcular a area de um triangulo a partir das medidas de seus lados a, b e c é a seguinte:

       area = Raiz Quadrada de p(p-a)(p-b)(p-c)     onde p = a + b + c / 2

     */


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ax, bx, cx, areax, ay, by, cy, areay, p;

        System.out.print("Digite a primeira medida do Triangulo X: ");
        ax = sc.nextDouble();
        System.out.print("Digite a segunda medida do Triangulo X: ");
        bx = sc.nextDouble();
        System.out.print("Digite a terceira medida do Triangulo X: ");
        cx = sc.nextDouble();

        System.out.print("Digite a primeira medida do Triangulo Y: ");
        ay = sc.nextDouble();
        System.out.print("Digite a segunda medida do Triangulo Y: ");
        by = sc.nextDouble();
        System.out.print("Digite a terceira medida do Triangulo Y: ");
        cy = sc.nextDouble();

        p = (ax + bx + cx) / 2;
        areax = Math.sqrt(p * (p - ax) * (p - bx) * (p - cx));

        p = (ay + by + cy) / 2;
        areay = Math.sqrt(p * (p - ay) * (p - by) * (p - cy));

        System.out.printf("O triangulo X possui area de: %.2f%n", areax);
        System.out.printf("O triangulo Y possui area de: %.2f%n", areay);

        if (areax > areay) {
            System.out.println("Maior área: Triangulo X");
        }

        else {
            System.out.println("Maior área: Triangulo Y");
        }

    }
}
