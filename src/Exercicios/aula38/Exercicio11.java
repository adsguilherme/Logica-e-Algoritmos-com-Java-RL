/*
    Crie uma matriz 3x2 (3 linhas e 2 colunas) vazia.

    Em um laço de repetição, peça três estados e três cidades.

    Armazene cada informação em uma posição da matriz.

    Exiba os valores contidos na matriz.
*/

package Exercicios.aula38;

import java.util.Scanner;

public class Exercicio11 {

    void main() {

        // Scanner
        Scanner obj = new Scanner(System.in);

        // Matriz
        String[][] dados = new String[3][2];

        // Obter dados
        for(int indice = 0; indice < 3; indice++){
            System.out.println("Informe o " +(indice+1)+ "º estado.");
            dados[indice][0] = obj.nextLine();

            System.out.println("Informe a " +(indice+1)+"ª cidade.");
            dados[indice][1] = obj.nextLine();
        }

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Listar dados
        for(int indice = 0; indice < 3; indice++){
            System.out.println(dados[indice][0] + " - " + dados[indice][1]);
        }
    }
}
