package membrosEstaticosExercicio;

public class Conversor {

    double preco, qtd;

    public static final double IOF = 6.0;

    public static final double converteDolar(double preco, double qtd){
        double res = (preco * qtd);
        res = res + res * (IOF / 100);
        return res;
    }
}
