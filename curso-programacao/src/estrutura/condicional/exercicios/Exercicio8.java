package estrutura.condicional.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    //Fazer um programa para ledr um valor inteiro de 1 a 7 representando um dia da semana (sendo
    // 1 = domingo, 2 = segunda, e assim por diante). Escreva na tela o dia da semana
    // correspondente

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        String dia;

        System.out.println("Qual o número da semana?");
        x = scanner.nextInt();

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        scanner.close();
    }
}
