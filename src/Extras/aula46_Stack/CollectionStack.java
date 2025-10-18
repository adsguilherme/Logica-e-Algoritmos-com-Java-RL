package Extras.aula46_Stack;

import java.util.Stack;

public class CollectionStack {
    // Stack == Pilha

    void main() {

        // Caso de uso: LIFO (Last In First Out > Último que entra é o primeiro que sai)

        // Stack
        Stack<String> paginas = new Stack<>();

        // Cadastrar
        paginas.push("www.google.com");
        paginas.push("www.github.com");
        paginas.push("www.youtube.com");

        // Exibir
        System.out.println("Lista cadastrada: " + paginas);

        // Remover
        paginas.pop();

        // Exibir
        System.out.println("Lista atualizada: " + paginas);

        // Peek
        System.out.println("Prévia da próxima página a ser removida: " + paginas.peek());
    }
}
