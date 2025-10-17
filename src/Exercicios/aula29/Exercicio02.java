/*
* Peca trés números inteiros, em seguida retorne o menor informado.
*/

package Exercicios.aula29;

import java.util.Scanner;

public class Exercicio02 {
    void main() {

        // Instanciar um objeto da classe Scanner
        Scanner obj = new Scanner(System.in);

        // Entrada - Obter os números
        System.out.println("Informe o primeiro número: ");
        int numero1 = obj.nextInt();

        System.out.println("Informe o segundo número: ");
        int numero2 = obj.nextInt();

        System.out.println("Informe o terceiro número: ");
        int numero3 = obj.nextInt();

        // Encontrar o menorNumero número
        int menorNumero = numero1;

        if (numero2 < menorNumero) {
            menorNumero = numero2;
        }

        if (numero3 < menorNumero) {
            menorNumero = numero3;
        }

        // Exibir o menor número
        System.out.println("O menor número é: " + menorNumero);

        // Fechar o objeto Scanner
        obj.close();
    }
}
