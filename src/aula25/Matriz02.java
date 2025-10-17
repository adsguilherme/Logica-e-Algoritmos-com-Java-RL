package aula25;

public class Matriz02 {

    void main() {

        // Matriz
        String[][] clientes = {
                {"Paulo", "Joinville"},
                {"Cleber", "Campinas"},
                {"Julia", "Curitiba"}
        };

        // Exibir
        for (int indice = 0; indice < clientes.length; indice++) {
            System.out.println("Cliente: " + clientes[indice][0] + " | Cidade: " + clientes[indice][1]);
        }
    }
}

