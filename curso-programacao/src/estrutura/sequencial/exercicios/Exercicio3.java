package estrutura.sequencial.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERENÇA = " + diferenca);

        scanner.close();
    }
}
