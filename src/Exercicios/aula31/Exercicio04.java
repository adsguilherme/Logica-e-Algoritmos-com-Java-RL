/*
    Crie um conversor de moedas.

    O cliente informa o tipo de conversão e o valor.

    Opções para conversão:
    1 - Dólar para Real.
    2 - Real para Dólar.
    3 - Euro para Real.
    4 - Real para Euro.

    Cotação sugerida:
    1 Dólar = R$5,50
    1 Euro  = R$6,00
*/

package Exercicios.aula31;

import java.util.Scanner;

public class Exercicio04 {

    void main() {

        // Scanner
        Scanner obj = new Scanner(System.in);

        // Obter o tipo de conversão
        System.out.println("Informe a conversão:");
        System.out.println("1 - Dólar para Real");
        System.out.println("2 - Real para Dólar");
        System.out.println("3 - Euro para Real");
        System.out.println("4 - Real para Euro");
        int tipoConversao = obj.nextInt();

        // Obter o valor
        System.out.println("Informe o valor.");
        double valor = obj.nextDouble();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Estrutura de escolha
        switch(tipoConversao){
            case 1:
                System.out.println("R$" + (valor * 5.50));
                break;

            case 2:
                System.out.println("US$ " + (valor / 5.50));
                break;

            case 3:
                System.out.println("R$ " + (valor * 6));
                break;

            case 4:
                System.out.println("€ " + (valor / 6));
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}