package estrutura.condicional;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horas;

        System.out.println("Quantas horas?");
        horas = scanner.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else if (horas < 18) {
            System.out.println("Boa tarde!");
            }
        else {
            System.out.println("Boa noite!");
        }

            scanner.close();
    }
}
