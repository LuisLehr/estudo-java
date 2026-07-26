package POOExercicio02;

public class Empregado {

    String nome;
    double salarioBruto;
    double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentaSalario(double valor) {
        this.salarioBruto = this.salarioBruto + (this.salarioBruto * valor / 100);
    }

    public String toString(){
        return "Empregado: " + nome + ", R$" + salarioLiquido() + "\n";
    }
}
