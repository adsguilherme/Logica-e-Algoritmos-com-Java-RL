/*
* Peça dois números inteiros.
* Se forem iguais, faça a soma, caso contrário faça a multiplicação.
*/

package Exercicios.aula30;

import java.util.Scanner;

public class Exercicio03 {
    void main() {

        // Instanciar um objeto da classe Scanner
        Scanner obj = new Scanner(System.in);

        // Entrada - Obter os números
        System.out.println("Informe o primeiro número: ");
        int numero1 = obj.nextInt();

        System.out.println("Informe o segundo número: ");
        int numero2 = obj.nextInt();

        // Condicional
        if (numero1 == numero2) {
            int soma = numero1 + numero2;
            System.out.println("Os números são iguais. A soma é: " + soma);
        } else {
            int multiplicacao = numero1 * numero2;
            System.out.println("Os números são diferentes. A multiplicação é: " + multiplicacao);
        }

        // Fechar o objeto Scanner
        obj.close();
    }

}
