package aula25;

public class Matriz {
    void main() {

        // Matriz
        String[][] clientes = {
                {"Paulo", "Joinville"},
                {"Cleber", "Campinas"},
                {"Julia", "Curitiba"}
        };

        // Exibir
        for (String[] c : clientes) {
            System.out.println("Cliente: " + c[0] + " | Cidade: " + c[1]);
        }
    }
}
