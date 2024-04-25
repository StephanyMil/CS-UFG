package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisão {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            double resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: valor informado não é numérico!");
        }
    }
}