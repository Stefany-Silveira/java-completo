package estrutura.condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    // Uma operadora de telefonia cobra R$50.00 por um plano básico que dá direito a 100 minutos
    // de telefone. Cada minuto que exceder a franquia de 100 minutos custa
    // R$2.0. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí
    // mostra o valor a ser pago

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int minutos = scanner.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        scanner.close();
    }
}
