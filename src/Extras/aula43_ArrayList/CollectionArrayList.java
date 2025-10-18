package Extras.aula43_ArrayList;

import java.util.ArrayList;

public class CollectionArrayList {
    void main() {

        // ArrayList
        ArrayList<String> nomes = new ArrayList<>();

        // Cadastrar nomes
        System.out.println("----------------------------");
        nomes.add("Guilherme");
        nomes.add("Ana");
        nomes.add("Ralf");

        //Laço de repetição para exibir os nomes (forEach)
        for(String n : nomes){
            System.out.println(n);
        }

        // Quantidade de registros
        System.out.println("Registros: " + nomes.size());

        // Alterar nome
        System.out.println("----------------------------");
        nomes.set(1, "Maria");
        System.out.println("Nome alterado para: " + nomes.set(1, "Maria"));

        // Exibir nomes
        System.out.println("----------------------------");
        System.out.println("# Lista de nomes atualizada #");
        System.out.println(nomes);

        // Remover nome
        nomes.remove(2);

        // Exibir nomes
        System.out.println("----------------------------");
        System.out.println("# Lista de nomes atualizada #");
        System.out.println(nomes);

        // Quantidade de registros
        System.out.println("Registros: " + nomes.size());

        // Remover todos os nomes
        nomes.clear();

        // Exibir nomes
        System.out.println("----------------------------");
        System.out.println("# Lista de nomes atualizada #");
        System.out.println(nomes);

        // Quantidade de registros
        System.out.println("Registros: " + nomes.size());
    }
}
