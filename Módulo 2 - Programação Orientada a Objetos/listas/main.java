package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    static void main(String[] args) {

        List<String> lista= new ArrayList<>();

        lista.add("Luis");
        lista.add("Rodrigo");
        lista.add("Fabio");
        lista.add("Diego");
        lista.add("Gordinho");
        lista.add("Raquel");
        lista.add("Tiago");
        lista.add("Guilherme");
        lista.add(2, "Cacaio"); // Adiciona o elemento na posição desejada

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("------------------------------------------------");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("------------------------------------------------");
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("------------------------------------------------");

        lista.remove(1); // removendo o nome do index 1 (Rodrigo)
        lista.remove("Diego"); // Removendo o Diego
        lista.removeIf(x -> x.charAt(0) == 'C'); // Removendo todo mundo que comeca com C da lista

        System.out.println(lista);

        System.out.println("------------------------------------------------");
        System.out.println("Index do Luis: " + lista.indexOf("Luis"));
        System.out.println("Index do Rodrigo: " + lista.indexOf("Rodrigo")); // Não existe, ira exibir -1

        System.out.println("------------------------------------------------");

        // Criando uma lista nova que recebe somente quem começa com R na lista antiga
        List<String> listaNova = lista.stream().filter(x -> x.charAt(0) == 'R').toList();

        for (String x : listaNova) {
            System.out.println(x);
        }

        // Achando a primeira pessoa da lista que começa com G ou retornando null
        String nome = lista.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);

        System.out.println("------------------------------------------------");
        System.out.println(nome);
    }
}
