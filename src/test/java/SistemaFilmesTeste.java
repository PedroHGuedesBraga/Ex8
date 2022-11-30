import exceptions.FilmeJaCadastradoExecption;
import sistema.CategoriaFilme;
import sistema.SistemaFilmesMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SistemaFilmesTeste {
    private SistemaFilmesMap filme;
    private List<CategoriaFilme> categorias;


    @BeforeEach
    public void setup(){
        SistemaFilmesMap filme = new SistemaFilmesMap();
        List<CategoriaFilme> categorias = new ArrayList<>();
    }

    @Test
    public void testeContaFilmesCategoria () throws FilmeJaCadastradoExecption {

        categorias.add(CategoriaFilme.ROMANCE);

        filme.cadastrarFilme("codigo", "nome",2001, 10,categorias);
        assertEquals(filme.contaFilmesDaCategoria(CategoriaFilme.ROMANCE),1);
    }

    @Test
    public void testeCadastraFilme() throws FilmeJaCadastradoExecption {

        categorias.add(CategoriaFilme.ROMANCE);

        try {
            filme.cadastrarFilme("codigo", "nome", 2001, 10, categorias);
            filme.cadastrarFilme("outroCodigo", "outroNome", 2001, 10, categorias);
        } catch (FilmeJaCadastradoExecption e) {
            fail("o codigo não poderia chegar nesse ponto");
        }
        assertThrows(FilmeJaCadastradoExecption.class, () -> filme.cadastrarFilme("codigo", "nome", 2001, 10, categorias), "deveria lançar esta exceção");


    }
}
