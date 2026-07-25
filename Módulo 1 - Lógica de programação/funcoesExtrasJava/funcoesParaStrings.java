package funcoesExtrasJava;

public class funcoesParaStrings {

    static void main(String[] args) {

        // Opções de formatação de Strings

        String original = "abcde FGHIJ ABC abc DEFG   ";
        System.out.println("String original:");
        System.out.println(original);

        // Passando tudo para o minusculo
        System.out.println(" ");
        System.out.println("Usando o toLoweCase: ");
        System.out.println(original.toLowerCase());

        // Passando tudo para o maiusculo
        System.out.println(" ");
        System.out.println("Usando o toUpperCase: ");
        System.out.println(original.toUpperCase());

        // Usando trim para tirar espaços no começo e no final da String
        System.out.println(" ");
        System.out.println("Usando o trim: ");
        System.out.println(original.trim());

        // Usando o substring para imprimir somente apartir do index 2
        System.out.println(" ");
        System.out.println("Usando o Substring(2): ");
        System.out.println(original.substring(2));

        // Usando o substring para imprimir somente do index 2 ao 9
        System.out.println(" ");
        System.out.println("Usando o Substring(2, 9): ");
        System.out.println(original.substring(2, 9));

        // Usando replace para trocar o primeiro argumento pelo segundo
        System.out.println(" ");
        System.out.println("Usando o replace('a', 'x'): ");
        System.out.println(original.replace('a', 'X'));

        // Usando replace para trocar a primeira substring pela segunda
        System.out.println(" ");
        System.out.println("Usando o replace(''abc'', ''xy''): ");
        System.out.println(original.replace("abc", "xy"));

        // Imprimindo o index da primeira aparição de alguma substring
        int i;
        System.out.println(" ");
        System.out.println("Usando o indexOf('bc') ");
        System.out.println(i = original.indexOf("bc"));

        // Imprimindo o index da última aparição de alguma substring
        System.out.println(" ");
        System.out.println("Usando o lastIndexOf('bc') ");
        System.out.println(i = original.lastIndexOf("bc"));

        // Usando replace para trocar a primeira substring pela segunda
        System.out.println(" ");
        System.out.println("Usando o replace(''abc'', ''xy''): ");
        System.out.println(original.replace("abc", "xy"));

        // Usando replace para trocar a primeira substring pela segunda
        System.out.println(" ");
        System.out.println("Usando o replace(''abc'', ''xy''): ");
        System.out.println(original.replace("abc", "xy"));
    }
}
