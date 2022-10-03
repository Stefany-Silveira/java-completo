package estrutura.sequencial.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, soma;
        a = scanner.nextInt();
        b = scanner.nextInt();

        soma = a +b;

        System.out.println("SOMA = " + soma );

        scanner.close();
    }
}
