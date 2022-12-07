package sistema;

import sistema.action.CadastraFilme;
import sistema.action.PesquisaFilmeAno;
import sistema.action.PesquisaFilmeCodigo;
import sistema.action.Sair;

import javax.swing.*;
import java.awt.*;
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
    JButton pesquisa = new JButton("Pesquisar um filme");
    pesquisa.setBounds(100,100,5,5);

    pesquisa.setVisible(true);

    //Cadastro
    JButton cadastrar = new JButton("Cadastrar");
    cadastrar.setBounds(100,100,5,5);
    cadastrar.setVisible(true);

    //obterFilmesLancadosEmAno
    JButton obterFilmesLancadosEmAno = new JButton("Pesquisar filmes por data");

    obterFilmesLancadosEmAno.setBounds(100,100, 5,5);
    obterFilmesLancadosEmAno.setVisible(true);

    //sair
    JButton sair = new JButton("Sair");
    sair.setBounds(100,100,5,5);
    sair.setVisible(true);

    // Cria botão> actionListener > faz esse bagulho aqui de baixo(criar nova funcionalidade)
    //add.ActionListener(new "Nome do novo metodo no caso o botao(this, a classe com que ele se refere))
    pesquisa.addActionListener(new PesquisaFilmeCodigo(this, sistemaFilmeMap));
    cadastrar.addActionListener(new CadastraFilme(this, sistemaFilmeMap));
    obterFilmesLancadosEmAno.addActionListener(new PesquisaFilmeAno(this, sistemaFilmeMap));
    sair.addActionListener(new Sair(this, sistemaFilmeMap));

    //Adicionando botões ao layout :
    layout.add(pesquisa);
    layout.add(cadastrar);
    layout.add(obterFilmesLancadosEmAno);
    layout.add(sair);
    this.setLayout(new BorderLayout(5,5));
    this.add(layout,BorderLayout.CENTER);
    setVisible(true);
}
    // depois implementar o action com base na classe que recebe
    // criar classe interna


}

