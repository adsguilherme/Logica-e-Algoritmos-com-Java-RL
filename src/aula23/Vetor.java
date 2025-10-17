package aula23;

public class Vetor {
    void main() {

        // Vetor (Array)
        String[] nomes = {"Guilherme", "João", "Maria", "Ralf"};

        // Exibição dos dados do vetor

        // System.out.println(nomes.length);
        // System.out.println(nomes[0]);
        // System.out.println(nomes[1]);
        // System.out.println(nomes[2]);
        // System.out.println(nomes[3]);

        // Exibição dos dados do vetor com Laço de repetição

        for (int indice = 0; indice < nomes.length; indice++) {
            System.out.println(nomes[indice]);
        }
    }
}
