import Exceptions.FilmeJaCadastradoExecption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Teste {
    @Test
    public Teste () throws FilmeJaCadastradoExecption {
        SistemaFilmesMap filme = new SistemaFilmesMap();
        filme.cadastrarFilme("codigo", "nome","anoLancamento", 10,CategoriaFilme.ROMANCE);
        assertEquals(filme.contaFilmesDaCategoria(CategoriaFilme.ROMANCE),1);
    }




}
