package POOExercicio03;

public class Aluno {

    double t1;
    double t2;
    double t3;

    public double notaFinal(){
        return t1 + t2 + t3;
    }

    public double pontosFaltando(){
        if (notaFinal() < 60) {
            return 60 - notaFinal();
        }
        else{
            return 0.0;
        }
    }
}
