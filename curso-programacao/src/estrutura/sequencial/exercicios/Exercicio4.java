package estrutura.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    //decimais

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero, horasTrabalhadas;
        double valorPorHora, salario;

        numero = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorPorHora = scanner.nextDouble();

        salario = valorPorHora * horasTrabalhadas;

        System.out.println("NUMERO = " + numero);
        System.out.printf("SALARIO = U$ %.2f%n", salario);
        scanner.close();
    }
}
