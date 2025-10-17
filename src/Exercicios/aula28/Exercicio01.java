/*
 * Peca duas notas, exiba a média e a situacao.
 * Média 7 ou superior = Aprovado.
 * Média inferior a 7 = Reprovado.
 */

package Exercicios.aula28;

import java.util.Scanner;

public class Exercicio01 {

    void main() {

        // Instanciar um objeto da classe Scanner
        Scanner obj = new Scanner(System.in);

        // Entrada - Obter as notas
        System.out.println("Informe a primeira nota: ");
        double nota1 = obj.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = obj.nextDouble();

        // Realiza Média
        double media = (nota1 + nota2) / 2;

        // Condicional
        if (media >= 7) {
            System.out.println("Aprovado com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }

        // Fechar o objeto Scanner e liberando os recursos associados ao stream de entrada (System.in)
        obj.close();
    }
}
