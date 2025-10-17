/*
    Crie uma matriz 3x3.

    Essa matriz terá os seguintes números:
    4 6 8
    9 1 3
    2 7 5

    Exiba a matriz.

    Exiba a soma de todos os valores contidos na matriz.
*/

package Exercicios.Aula39;

public class Exercicio12 {

    void main() {

        // Matriz
        int[][] numeros = {
                {4, 6, 8},
                {9, 1, 3},
                {2, 7, 5}
        };

        // Soma
        int soma = 0;

        // Laço de repetição - Linha
        for(int linha = 0; linha < 3; linha++){

            // Laço de repetição - Coluna
            for(int coluna = 0; coluna < 3; coluna++){

                // Exibir número
                System.out.print(numeros[linha][coluna] + " ");

                // Somar
                soma += numeros[linha][coluna];
            }

            // Quebra de linha
            System.out.println();
        }

        // Exibir a soma dos valores
        System.out.println("A soma é: " + soma);

    }
}

