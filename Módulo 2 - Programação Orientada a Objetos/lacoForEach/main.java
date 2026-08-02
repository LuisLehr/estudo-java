package lacoForEach;

public class main {

    static void main(String[] args) {

        String[] nomes = new String[] {"Bob", "Alex", "Claudio"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("");

        // SINTAXE OPCIAL SIMPLIFICADA PARA LACO FOR
        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
