package segundoProblemaEstoque;

public class Produto {

    // Variaveis da classe produto
    private String nome;
    private double preco;
    private int quantidade;

    //Construtores
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {

    }

    // Métodos Getters e Setters (Quantidade nao possui setter por segurança)
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }


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
