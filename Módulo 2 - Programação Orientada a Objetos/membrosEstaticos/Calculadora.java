package membrosEstaticos;

public class Calculadora {


    // Membros com static final são inalteraveis, irão trabalhar sempre com os mesmos valores/formular
    public static final double PI = 3.14159;

    // Membros com static final são inalteraveis, irão trabalhar sempre com os mesmos valores/formular
    public static final double circunferencia(double raio){
        return 2.0 * PI * raio;
    }

    // Membros com static final são inalteraveis, irão trabalhar sempre com os mesmos valores/formular
    public static final double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
