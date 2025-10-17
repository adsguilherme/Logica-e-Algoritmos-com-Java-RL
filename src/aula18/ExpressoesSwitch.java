package aula18;

public class ExpressoesSwitch {
    void main() {

        // Variável
        String cidade = "São Paulo";

        // Switch Expressions
        String mensagem = switch (cidade) {
            case "São Paulo" -> "A maior cidade do país.";
            case "Rio de Janeiro" -> "Cidade de belas praias.";
            default -> "Cidade não econtrada.";
        };

        System.out.println(mensagem);
    }

}
