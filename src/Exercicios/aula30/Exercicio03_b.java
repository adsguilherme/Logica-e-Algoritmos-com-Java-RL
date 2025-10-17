/*
 * Peça dois números inteiros.
 * Se forem iguais, faça a soma, caso contrário faça a multiplicação.
 * Obs: Faça a condição utilizando operador ternário.
 */

package Exercicios.aula30;

import java.util.Scanner;

public class Exercicio03_b {
    public static void main(String[] args) {

        // Instanciar um objeto da classe Scanner
        Scanner obj = new Scanner(System.in);

        // Entrada - Obter os números
        System.out.println("Informe o primeiro número: ");
        int numero1 = obj.nextInt();

        System.out.println("Informe o segundo número: ");
        int numero2 = obj.nextInt();

        // Condicional com operador ternário
        String resultado = (numero1 == numero2) ?
                "Os números são iguais. A soma é: " + (numero1 + numero2) :
                "Os números são diferentes. A multiplicação é: " + (numero1 * numero2);

        System.out.println(resultado);

        // Fechar o objeto Scanner
        obj.close();
    }
}
