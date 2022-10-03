package estrutura.sequencial.entradadedados;

import java.util.Scanner;

public class Exemplo3 {
    //entrada de número com ponto flutuantes

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        x = scanner.nextDouble();
        System.out.println("Você digitou: " + x);

        scanner.close();

    }
}
