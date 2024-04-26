package atividade08;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);
        try {
            conta.sacar(500.0);
            System.out.println("Saldo atual: " + conta.getSaldo());
            conta.sacar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}