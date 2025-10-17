package aula18;

import java.util.Scanner;

public class ExpressoesSwitch_b {
    void main() {

        Scanner obj = new Scanner(System.in);

        // Obter a cidade
        System.out.println("Informe a cidade:");
        System.out.println("1 - São Paulo");
        System.out.println("2 - Rio de Janeiro");
        int selecaoCidade = obj.nextInt();

        // Switch Expressions
        String mensagem = switch (selecaoCidade) {
            case 1 -> "A maior cidade do país.";
            case 2 -> "Cidade de belas praias.";
            default -> "Cidade não econtrada.";
        };

        System.out.println(mensagem);
    }
}
