package segundoProblemaEstoque;

public class Produto {

    // Variaveis da classe produto
    public String nome;
    public double preco;
    public int quantidade;

    // Calcular valor em estoque
    public double valorTotalEmEstoque() {
        return quantidade * preco;
    }

    // Adicionar quantidade ao produto
    public void addProduto(int quantidade){
        this.quantidade = this.quantidade + quantidade;
    }

    // Remover quantidade do produto
    public void removeProduto(int quantidade) {
        this.quantidade = this.quantidade - quantidade;
    }

    public String toString(){
        return "Nome: " + nome + "\n" +
                "Preço: " + preco + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Valor total em estoque: R$" + valorTotalEmEstoque();
    }
}
