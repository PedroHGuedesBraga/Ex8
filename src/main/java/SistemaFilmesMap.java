import Exceptions.FilmeJaCadastradoExecption;
import Exceptions.FilmeNaoExisteExecption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaFilmesMap {
    Map<String,Filme> filmesMap = new HashMap<>();

    public SistemaFilmesMap(){

    }

    public void cadastrarFilme( String codigo, String nome, String anoLancamento,int duracaoEmMinutos,CategoriaFilme CategoriaFilme) throws FilmeJaCadastradoExecption {
        Filme filme = new Filme(codigo, nome, anoLancamento, duracaoEmMinutos, CategoriaFilme);
        if(filmesMap.containsKey(codigo)){
        throw new FilmeJaCadastradoExecption("Filme já cadastrado");
        }else{
            filmesMap.put(codigo,filme);
        }

    }
    public Filme pesquisaFilme(String codigo) throws FilmeNaoExisteExecption {
        if (filmesMap.containsKey(codigo)) {
            return filmesMap.get(codigo);
        } else {
            throw new FilmeNaoExisteExecption("Não existe");
        }
    }

    public List<Filme>obterFilmesLancadosEm(int ano){
        List<Filme> obterLancados = new ArrayList<>();
        for( Filme f : filmesMap.values()){
            if (f.getAnoLancamento().equals(ano)){
                obterLancados.add(f);
            }

        }
        return obterLancados;
    }
    public List<Filme> obterFilmesComNome(String nome){
    List<Filme> obterFilme = new ArrayList<>();
    for (Filme f : filmesMap.values() ){
        if ( f.getNome().equals(nome)){
            obterFilme.add(f);
        }
    }
        return obterFilme;
    }
    public boolean existemFilmesDaCategoria( CategoriaFilme categoria) {
        for (Filme f : filmesMap.values()) {
            if (f.ehDaCategoria(categoria)) {
                return true;
            }
        }
        return false;
    }
    public int contaFilmesDaCategoria( CategoriaFilme categoria){
        int count = 0;
        for (Filme f: filmesMap.values()) {
            if (f.ehDaCategoria(categoria)){
                count++;
            }
        }
        return count;
    }

}
