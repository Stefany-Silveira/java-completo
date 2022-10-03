package estrutura.sequencial.entradadedados;

import java.util.Scanner;

public class Exemplo5 {
    //entrada de vários dados na mesma linha

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = scanner.next();
        System.out.println("Voce digitou: "+ x);

        y = scanner.nextInt();
        System.out.println("Voce digitou: " + y);

        z = scanner.nextDouble();
        System.out.println("Voce digitou: " + z);

        scanner.close();
    }
}
