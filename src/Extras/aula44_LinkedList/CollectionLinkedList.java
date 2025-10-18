package Extras.aula44_LinkedList;

import java.util.LinkedList;

public class CollectionLinkedList {

    void main() {
        // Caso de uso
        // ArraysList: Leitura de dados
        // LinkedList: Cadastro e removação (First e Last)

        // LinkedLIst
        LinkedList<String> cores = new LinkedList<>();

        // Cadastrar cores
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Verde");

        // Exibir cores
        System.out.println(cores);

        // Quantidade de registros
        System.out.println("Registros: " + cores.size());

        // Alterar
        cores.set(1, "Laranja");

        // Exibir cores
        System.out.println(cores);

        // Remover
        cores.removeFirst();
        cores.removeLast();

        // Exibir cores
        System.out.println("Cor existente na lista: " + cores);

        // Quantidade de registros
        System.out.println("Registros: " + cores.size());

    }
}
