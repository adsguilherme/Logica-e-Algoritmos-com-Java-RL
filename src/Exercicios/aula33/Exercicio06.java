/*
    Informe o código do produto e a quantidade, em seguida retorne o total a pagar.

    Produtos:
    1 | Camisa Masculina Azul   | R$59,90
    2 | Calça Jeans Feminina    | R$129,90
    3 | Bermuda Masculina       | R$79,90
    4 | Blusa Feminina Amarela  | R$57,70
    5 | Camisa Masculina Verde  | R$64,90
*/

package Exercicios.aula33;

import java.util.Scanner;

public class Exercicio06 {

    void main() {

        // Scanner
        Scanner obj = new Scanner(System.in);

        // Obter o código do produto
        System.out.println("1 | Camisa Masculina Azul   | R$59,90");
        System.out.println("2 | Calça Jeans Feminina    | R$129,90");
        System.out.println("3 | Bermuda Masculina       | R$79,90");
        System.out.println("4 | Blusa Feminina Amarela  | R$57,70");
        System.out.println("5 | Camisa Masculina Verde  | R$64,90");
        int codigo = obj.nextInt();

        // Obter a quantidade
        System.out.println("Informe a quantidade");
        int quantidade = obj.nextInt();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Estrutura de escolha
        switch(codigo){
            case 1:
                System.out.println(59.90 * quantidade);
                break;

            case 2:
                System.out.println(129.90 * quantidade);
                break;

            case 3:
                System.out.println(79.90 * quantidade);
                break;

            case 4:
                System.out.println(57.70 * quantidade);
                break;

            case 5:
                System.out.println(64.90 * quantidade);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}