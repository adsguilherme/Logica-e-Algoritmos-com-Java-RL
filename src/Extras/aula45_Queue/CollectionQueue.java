package Extras.aula45_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {

    // Queue == Fila

    void main() {

        // Caso de uso: FIFO (Fist In First Out > Primeiro que entra é o primeiro que sai)

        // Queue
        Queue<String> nomes = new LinkedList<>();

        // Cadastro nomes queue
        nomes.offer("Ana");
        nomes.offer("Guilherme");
        nomes.offer("Ralf");

        // Exibir nomes
        System.out.println(nomes);

        // Remover
        nomes.poll();

        // Exibir nomes
        System.out.println(nomes);

    }
}
