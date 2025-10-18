package Extras.aula42_TratamentoDeErros;

import java.util.Scanner;

public class TratamentoDeErros {
    void main() {

        Scanner obj = new Scanner(System.in);

       // Try - Catch
        try{
            // Obter um número inteiro
            System.out.println("Informe um número inteiro");
            int numero = obj.nextInt();

            // Exibir número informado
            System.out.println("O número informado é: " + numero);
        }catch(Exception e){
            // Mensagem
            System.out.println("Erro: " + e);
        }finally { // O finally é opcional e por isso deixamos o obj.close aqui dentro para complementar a explicação
            // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
            obj.close();
        }
    }
}
