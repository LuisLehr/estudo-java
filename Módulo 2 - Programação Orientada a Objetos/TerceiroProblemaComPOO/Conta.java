package TerceiroProblemaComPOO;

public class Conta {

    private final int numeroConta;
    private  String nomeCliente;
    private double saldo;

    // Construtores
    public Conta(int numeroConta, String nomeCliente, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        deposito(depositoInicial);
    }

    public Conta(int numeroConta, String nomeCliente){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos
    public void deposito(double valor){
        this.saldo = this.saldo + valor;
    }

    public void saque(double valor){
        this.saldo = this.saldo - valor - 5;
    }

    public String toString(){
        return "Conta: " + numeroConta + ", Titular: " + nomeCliente + ", Saldo: R$" + saldo;
    }
}
