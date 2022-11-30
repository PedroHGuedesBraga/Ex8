package sistema;

import exceptions.FilmeNaoExisteExecption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;
public class SistemaFilmeGUI extends JFrame  {

public SistemaFilmeGUI(SistemaFilmeMap sistemaFilmeMap){
    //Tela
    setTitle("Sistema Filmes");
    setSize(1280,720);
    setResizable(false);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    this.setLayout(new BorderLayout(5,5));
    //Componente dentro da janela
    JPanel layout = new JPanel();
    layout.setLayout(new GridLayout(2,3));

    //Botoes

    //Pesquisa
    JButton pesquisa = new JButton("Pesquisar");
    pesquisa.setBounds(100,100,05,05);

    pesquisa.setVisible(true);

    //Cadastro
    JButton cadastrar = new JButton("Cadastrar");
    cadastrar.setBounds(100,100,05,05);
    cadastrar.setVisible(true);

    //obterFilmesLancadosEm
    JButton obterFilmesLancadosEm = new JButton("obterFilmesLancadosEm");

    obterFilmesLancadosEm.setBounds(100,100,05,05);
    obterFilmesLancadosEm.setVisible(true);

    // Cria botão> actionListener > faz esse bagulho aqui de baixo(criar nova funcionalidade)
    //add.ActionListener(new "Nome do novo metodo no caso o botao(this, a classe com que ele se refere))
    pesquisa.addActionListener(new PesquisaFilme(this, sistemaFilmeMap));
    cadastrar.addActionListener(new CadastraFilme(this, sistemaFilmeMap));
    obterFilmesLancadosEm.addActionListener(new ObterFilmesLancadosEm(this, sistemaFilmeMap));
    //Adicionando botões ao layout :
    layout.add(pesquisa);
    layout.add(cadastrar);
    layout.add(obterFilmesLancadosEm);
    this.setLayout(new BorderLayout(5,5));
    this.add(layout,BorderLayout.CENTER);
    setVisible(true);
}
    // depois implementar o action com base na classe que recebe
    // criar classe interna




    private class PesquisaFilme implements ActionListener {
        SistemaFilmeGUI screen;
        SistemaFilmeMap sistemaFilmeMap;
        public PesquisaFilme(SistemaFilmeGUI sistema, SistemaFilmeMap sistemaFilmeMap) {
            this.screen = sistema;
            this.sistemaFilmeMap = sistemaFilmeMap;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                sistemaFilmeMap.pesquisaFilme("02");
                System.out.println(sistemaFilmeMap.pesquisaFilme("02"));
            } catch (FilmeNaoExisteExecption ex) {
                throw new RuntimeException(ex);
            }

        }
    }


    private class ObterFilmesLancadosEm implements ActionListener {
        SistemaFilmeGUI screen;
        SistemaFilmeMap sistemaFilmeMap;
        public ObterFilmesLancadosEm(SistemaFilmeGUI SistemaFilmeGUI, SistemaFilmeMap sistemaFilmeMap) {
            this.screen = SistemaFilmeGUI;
            this.sistemaFilmeMap = sistemaFilmeMap;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            sistemaFilmeMap.obterFilmesLancadosEm(20);
        }
    }
}

