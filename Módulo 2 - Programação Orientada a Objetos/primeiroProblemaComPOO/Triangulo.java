package primeiroProblemaComPOO;

    // Criando uma entidade Triangulo para armazenar as medidas de cada triangulo

public class Triangulo {

    public double a;
    public double b;
    public double c;

    public double calculaArea(){
        double p = (a + b + c) / 2;
        double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return resultado;
    }
}
