package sistema.action;

import sistema.SistemaFilmeGUI;
import sistema.SistemaFilmeMap;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sair implements ActionListener {

    SistemaFilmeGUI screen;
    SistemaFilmeMap sistemaFilmeMap;

    public Sair(SistemaFilmeGUI sistema, SistemaFilmeMap sistemaFilmeMap) {
        this.screen = sistema;
        this.sistemaFilmeMap = sistemaFilmeMap;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null,"deseja mesmo sair","ATENÇÃO",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

}
