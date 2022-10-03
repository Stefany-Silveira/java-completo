package estrutura.sequencial.entradadedados;

import java.util.Scanner;

public class Exemplo4 {
    //entrada de um caractere

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char x;
        x = scanner.next().charAt(0);
        System.out.println("Você digitou: " + x);

        scanner.close();
    }
}
