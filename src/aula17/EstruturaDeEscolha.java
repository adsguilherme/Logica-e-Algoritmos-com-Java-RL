package aula17;

public class EstruturaDeEscolha {
    void main() {

        // Variável
        String cidade = "São Paulo";

        // Estrutura de escolha
        switch (cidade) {
            case "São Paulo":
                System.out.println("A maior cidade do país.");
                break;

            case "Rio de Janeiro":
                System.out.println("Cidade de belas praias.");
                break;

            default:
                System.out.println("Cidade não econtrada.");
                break;
        }
    }
}
