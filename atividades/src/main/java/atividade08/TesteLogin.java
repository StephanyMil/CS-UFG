package atividade08;

public class TesteLogin {
    public static void main(String[] args) {
        Login login = new Login("admin", "123");
        try {
            boolean resultado = login.fazerLogin("admin", "123");
            if (resultado) {
                System.out.println("Login realizado com sucesso!");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
