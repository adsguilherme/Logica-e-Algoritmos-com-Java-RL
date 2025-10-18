package Extras.aula49_JOptionPane;

// JOptionPane é uma classe que permite criar janelas de diálogo padrão.
// É útil para exibir mensagens, solicitar entrada de dados ou confirmar ações do usuário.

import javax.swing.*;

public class ModalJOptionPane {
    void main() {

        // Mensagem
        //JOptionPane.showMessageDialog(null, "Olá Mundo!");

        // Obter dados
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        JOptionPane.showMessageDialog(null, "O nome informado é " + nome);

    }
}
