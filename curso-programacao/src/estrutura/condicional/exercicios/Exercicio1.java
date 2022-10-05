package estrutura.condicional.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Qual o número?");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }
        scanner.close();
    }
}
