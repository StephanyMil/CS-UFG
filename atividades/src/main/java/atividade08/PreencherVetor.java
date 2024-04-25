package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int indice = 0;
        try {
            while (true) {
                System.out.println("Digite um número inteiro (ou 0 para sair): ");
                int numero = scanner.nextInt();
                if (numero == 0) {
                    break;
                }
                if (indice == 10) {
                    throw new ArrayIndexOutOfBoundsException("Tamanho máximo do vetor atingido.");
                }
                vetor[indice] = numero;
                indice++;
            }
            System.out.println("Valores digitados: ");
            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor digitado não é um número inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }
}