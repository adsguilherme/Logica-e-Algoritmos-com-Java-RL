package Extras.aula47_HashMap;

import java.util.HashMap;

public class CollectionHashMap {
    void main() {

        // HashMap não trabalha com índices e sim com chaves

        HashMap<String, String> linguagens = new HashMap<>();

        // Cadastrar

        linguagens.put("Java", "Linguagem multiplataforma"); // O put serve tanto para adicionar quanto para alterar
        linguagens.put("HTML", "Linguagem de marcação");
        linguagens.put("CSS", "Linguagem de estilos");

        System.out.println(linguagens);

        // Exibir informações refenente a linguagem Java
        System.out.println("Java: " + linguagens.get("Java"));

        // Remover
        linguagens.remove("Java");

        // Exibir
        System.out.println("Java: " + linguagens.get("Java")); // Saída foi null, pois a chave Java foi removida
        System.out.println(linguagens);
    }
}
