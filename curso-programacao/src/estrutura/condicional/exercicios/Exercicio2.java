package estrutura.condicional.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Qual o número?");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Ímpar");
        }

        scanner.close();
    }
}
