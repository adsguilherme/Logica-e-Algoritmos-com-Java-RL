package aula09;

public class Concatenacao {

    void main() {

        // Variáveis

        String nome = "Guilherme";
        int idade = 39;

        // Concatenação de duas formas:
        System.out.println("Olá " +nome+ " você tem " +idade+ " anos.");
        System.out.println(String.format("Olá %s você tem %d anos.", nome, idade));

    }
}
