/*
    Peça dois números inteiros e um tipo de cálculo.

    As opções de cálculos são:
    1 - Somar
    2 - Subtrair
    3 - Multiplicar
    4 - Dividir

    Em seguida, retorne o valor.
*/

package Exercicios.aula32;

import java.util.Scanner;

public class Exercicio05 {

    void main() {

        // Scanner
        Scanner obj = new Scanner(System.in);

        // Obter o primeiro número
        System.out.println("Informe o primeiro número:");
        int numero1 = obj.nextInt();

        // Obter o segundo número
        System.out.println("Informe o segundo número:");
        int numero2 = obj.nextInt();

        // Obter o cálculo
        System.out.println("Selecione o cálculo:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int calculo = obj.nextInt();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Expressões Switch
        double retorno = switch(calculo){
            case 1 -> numero1+numero2;
            case 2 -> numero1-numero2;
            case 3 -> numero1*numero2;
            case 4 -> numero1/numero2;
            default -> 0;
        };

        // Exibir o retorno
        System.out.println("Resultado: " + retorno);
    }
}