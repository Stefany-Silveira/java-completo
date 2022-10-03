package estrutura.sequencial.entradadedados;

import java.util.Scanner;

public class Exemplo2 {
    //entrada de número inteiro

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();
        System.out.println("Você digitou: " + x);

        scanner.close();
    }
}
