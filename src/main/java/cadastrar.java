import Exceptions.FilmeJaCadastradoExecption;
import Exceptions.FilmeNaoExisteExecption;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cadastrar extends JFrame  {

public cadastrar(SistemaFilmesMap sistemaFilmesMap){
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
    cadastrar.addActionListener(new cadastraFilme(this,sistemaFilmesMap));
    obterFilmesLancadosEm.addActionListener(new ObterFilmesLancadosEm(this,sistemaFilmesMap));
    //Adicionando botões ao layout :
    layout.add(pesquisa);
    layout.add(cadastrar);
    layout.add(obterFilmesLancadosEm);
    this.setLayout(new BorderLayout(5,5));
    this.add(layout,BorderLayout.CENTER);
    setVisible(true);
}
    // dpois implementa o action com base na classe que recebe
    // criar classe interna


    private class cadastraFilme implements ActionListener {
       cadastrar screen;
       SistemaFilmesMap sistemaFilmesMap;
        public cadastraFilme(cadastrar screen, SistemaFilmesMap sistemaFilmesMap) {
            this.screen = screen;
            this.sistemaFilmesMap = sistemaFilmesMap;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                sistemaFilmesMap.cadastrarFilme("02","vsf","2001",10,CategoriaFilme.TERROR);
            } catch (FilmeJaCadastradoExecption ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    private class pesquisaFilme implements ActionListener {
        cadastrar screen;
        SistemaFilmesMap sistemaFilmesMap;
        public pesquisaFilme(cadastrar cadastrar, SistemaFilmesMap sistemaFilmesMap) {
            this.screen = cadastrar;
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
        cadastrar screen;
        SistemaFilmesMap sistemaFilmesMap;
        public ObterFilmesLancadosEm(cadastrar cadastrar, SistemaFilmesMap sistemaFilmesMap) {
            this.screen = cadastrar;
            this.sistemaFilmesMap = sistemaFilmesMap;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            sistemaFilmesMap.obterFilmesLancadosEm(20);
        }
    }
}

