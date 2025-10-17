package aula19;

public class ConversaoDeDados {
    void main() {

        //Variáveis
        String n1 = "5";
        int n2 = 5;

        //Soma
        System.out.println(n1 + n2); //Saída: 55
        System.out.println(Integer.parseInt(n1) + n2); //Saída: 10
        System.out.println(String.valueOf(n2) + n1); //Saída: 55

        // String.valueOf(n2), converteu a variável n2 int para String.

    }
}
