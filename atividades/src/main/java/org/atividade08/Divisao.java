package org.atividade08;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = dividirNumeros(numero1, numero2);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico!");
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero!");
        }
    }

    public static double dividirNumeros(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return a / b;
    }
}