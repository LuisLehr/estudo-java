package estruturasRepetitivas;

import java.util.Objects;
import java.util.Scanner;

public class estruturaWhileExercicio01 {

    // Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    // incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    // impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

    static void main(String[] args) {

        String senhaSalva, senhaDigitada;

        senhaSalva = "2002";
        senhaDigitada = "1";

        Scanner sc = new Scanner(System.in);

        while (!senhaDigitada.equals(senhaSalva)) {
            System.out.print("Digite sua senha: ");
            senhaDigitada = sc.nextLine();

            if (!senhaDigitada.equals(senhaSalva)) {
                System.out.println("\nA senha digitada está incorreta!\n");
            }
        }

        System.out.println("\nSenha correta!");
    }
}
