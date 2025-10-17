package aula24;

public class ForEach {

    // ForEach: Quer dizer 'para cada'

    void main() {

        // Vetor (Array)
        String[] cidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Salvador"};

        // Exibir
        for (String c : cidades) {
            System.out.println(c);
        }
    }
}

/**
 * OS dois pontos que aparecem no for, fazem parte do enhanced for loop do Java, também chamado de foreach.
 *
 * O que ele faz:
 * Ele percorre cada item da lista cidades, e a cada volta do loop, ele atribui o item atual à variável c.
 *
 * Ou seja, é como se dissesse:
 * "Para cada cidade c dentro da lista cidades, faça alguma coisa..."
 *
 * É uma forma mais simples e legível de iterar por listas, ao invés de usar um for tradicional com índice.
 */