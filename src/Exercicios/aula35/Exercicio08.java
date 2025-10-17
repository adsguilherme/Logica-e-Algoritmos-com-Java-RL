/*
    Peça um número, em seguida exiba a tabuada.
*/

package Exercicios.aula35;

import java.util.Scanner;

public class Exercicio08 {

    void main() {

        // Scanner
        Scanner obj = new Scanner(System.in);

        // Obter um número
        System.out.println("Informe um número");
        int numero = obj.nextInt();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Tabuada
        int indice = 1;

        System.out.println("Tabuada do " + numero);
        System.out.println("------------------");

        while(indice < 11){
            System.out.println(numero + " x " + indice + " = " + (numero * indice));
            indice++;
        }
    }
}
