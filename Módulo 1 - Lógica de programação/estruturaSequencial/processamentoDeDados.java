package estruturaSequencial;

public class processamentoDeDados {
    public static void main(String[] args) {

        // EXEMPLO 1
        // Iniciando as variaveis
        int x, y;

        x = 5;
        y = 5 * 2;

        // Saidas
        System.out.println("Exemplo 1");
        System.out.println(x);
        System.out.println(y);
        System.out.print("\n");

        //EXEMPLO 2
        // Iniciando as variaveis
        int a;
        double b;

        a = 5;
        b = 5 * 2;

        // Saidas
        System.out.println("Exemplo 2");
        System.out.println(a);
        System.out.println(b);
        System.out.print("\n");

        // EXEMPLO 3
        // Calculando area de um trapezio
        double c, d ,e ,area;

        c = 6;
        d = 8;
        e = 5;

        area = (c + d) / 2 * e;
        System.out.println("Exemplo 3");
        System.out.println("A área do trapézio é: " + area);
        System.out.print("\n");

        // EXEMPLO 4
        int f;
        int g;
        double resultado;

        f = 5;
        g = 2;
        resultado = (double) f / g;
        System.out.println("Exemplo 4");
        System.out.println(resultado);
        System.out.print("\n");

        // EXEMPLO 5
        double h;
        int i;

        h = 5.0;
        i = (int) h;

        System.out.println("Exemplo 5");
        System.out.println(i);

    }
}
