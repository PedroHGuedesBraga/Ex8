package sistema;

import exceptions.FilmeNaoExisteExecption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SistemaFilmeGUI extends JFrame  {

public SistemaFilmeGUI(SistemaFilmesMap sistemaFilmesMap){
    //Tela
    setTitle("Sistema Filmes");
    setSize(1280,720);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    pesquisa.addActionListener(new pesquisaFilme(this,sistemaFilmesMap));
    cadastrar.addActionListener(new CadastraFilme(this,sistemaFilmesMap));
    obterFilmesLancadosEm.addActionListener(new ObterFilmesLancadosEm(this,sistemaFilmesMap));
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




    private class pesquisaFilme implements ActionListener {
        SistemaFilmeGUI screen;
        SistemaFilmesMap sistemaFilmesMap;
        public pesquisaFilme(SistemaFilmeGUI SistemaFilmeGUI, SistemaFilmesMap sistemaFilmesMap) {
            this.screen = SistemaFilmeGUI;
            this.sistemaFilmesMap = sistemaFilmesMap;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                sistemaFilmesMap.pesquisaFilme("02");
                System.out.println(sistemaFilmesMap.pesquisaFilme("02"));
            } catch (FilmeNaoExisteExecption ex) {
                throw new RuntimeException(ex);
            }

        }
    }


    private class ObterFilmesLancadosEm implements ActionListener {
        SistemaFilmeGUI screen;
        SistemaFilmesMap sistemaFilmesMap;
        public ObterFilmesLancadosEm(SistemaFilmeGUI SistemaFilmeGUI, SistemaFilmesMap sistemaFilmesMap) {
            this.screen = SistemaFilmeGUI;
            this.sistemaFilmesMap = sistemaFilmesMap;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            sistemaFilmesMap.obterFilmesLancadosEm(20);
        }
    }
}

