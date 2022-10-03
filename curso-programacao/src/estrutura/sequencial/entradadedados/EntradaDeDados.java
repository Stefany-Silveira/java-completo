package estrutura.sequencial.entradadedados;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x;
        x = scanner.next();
        System.out.println("Você digitou: " + x);

        scanner.close();
    }
}
