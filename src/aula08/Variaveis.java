package aula08;

/**
 *  1 - Não pode conter caracteres especiais (exceto o underline _ )
 *  2 - Não podemos utilizar espaços entre palavras
 *  3 - Não pode iniciar com números
 *  4 - Não iniciar com letras maiúsculas
 *  5 - Não utilizar palavras reservadas (ex: public, class, void ...)
 *
 */

public class Variaveis {

    void main() {

        // Tipagem da variável
        String nome =  "Guilherme";
        char letra = 'G';
        int idade = 39;
        double altura = 1.80;
        boolean estuda = true;

        System.out.println(nome);
        System.out.println(letra);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(estuda);

    }
}
