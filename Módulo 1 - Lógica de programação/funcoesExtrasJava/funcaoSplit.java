package funcoesExtrasJava;

public class funcaoSplit {

    static void main(String[] args) {


        // Usando o split para armazenar uma String em um array

        String s = "Batata Arroz Feijão";

        String[] vect = s.split(" ");
        String w1 = vect[0];
        String w2 = vect[1];
        String w3 = vect[2];

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}
