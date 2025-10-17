
/*
    Crie um vetor contendo os números: 5, 8, 3, 1, 9.

    Implemente um laço de repetição para percorrer cada posição e contabilizar a quantidade de pares e ímpares.

    Em seguida exiba suas respectivas quantidades.
*/
package Exercicios.aula36;

public class Exercicio09 {

    void main() {

        // Vetor
        int[] numeros = {5, 8, 3, 1, 9};

        // Variáveis
        int par = 0;
        int impar = 0;

        // Laço de repetição
        for(int indice=0; indice<5; indice++){

            if(numeros[indice] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }

        // Exibir a quantidade de pares e ímpares
        System.out.println("Par: " + par);
        System.out.println("Ímpar: " + impar);

    }
}
