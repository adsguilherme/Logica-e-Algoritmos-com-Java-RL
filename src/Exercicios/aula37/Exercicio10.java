/*
    Crie um vetor contendo três posições vazias.

    Em seguida crie um laço de repetição para pedir três nomes e armazenar no vetor.

    Após executar o laço, exiba os nomes contidos no vetor.
*/

package Exercicios.aula37;

import java.util.Scanner;

public class Exercicio10 {

    void main() {

        // Scanner
        Scanner obj = new Scanner(System.in);

        // Vetor
        String[] nomes = new String[3];

        // Laço de repetição para obter os nomes (for)
        for(int indice=0; indice<3; indice++){
            System.out.println("Informe o " +(indice+1)+ "º nome");
            nomes[indice] = obj.nextLine();
        }

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Laço de repetição exibir os nomes obtidos (forEach)
        for(String n : nomes){
            System.out.println("Lista de nomes: " + n);
        }
    }
}
