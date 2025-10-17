package aula21;

public class DoWhile {
    void main() {

        // Variável de índice
        int indice = 10;

        // Laço de repetição (exibir de 1 a 10)
        do {
            System.out.println(indice);
            indice--; // O índice sempre será decrementado 1 número a cada repetição.
        } while (indice >= 1);
    }
}
