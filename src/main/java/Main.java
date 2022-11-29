import Exceptions.FilmeJaCadastradoExecption;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws FilmeJaCadastradoExecption {
        SistemaFilmesMap sistemaFilmesMap = new SistemaFilmesMap();
        new cadastrar(sistemaFilmesMap);


    }
}
