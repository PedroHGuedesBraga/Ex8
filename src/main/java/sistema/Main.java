package sistema;

import exceptions.FilmeJaCadastradoExecption;

public class Main {
    public static void main(String[] args) throws FilmeJaCadastradoExecption {
        SistemaFilmesMap sistemaFilmesMap = new SistemaFilmesMap();
        new SistemaFilmeGUI(sistemaFilmesMap);


    }
}