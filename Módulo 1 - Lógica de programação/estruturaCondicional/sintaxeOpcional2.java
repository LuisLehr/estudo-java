package estruturaCondicional;

public class sintaxeOpcional2 {

    static void main(String[] args) {

        double preco, desconto;

        preco = 29;

        // desconto = (preco < 30) ? (sim, menor que trinta) : (não, maior que trinta)
        desconto = (preco < 30) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
    }
}
