package sistema;

import java.util.List;

public class Filme {
    private String codigo;
    private String nome;
    private int anoLancamento;
    private int duracaoEmMinutos;

    private List <CategoriaFilme> categoriaFilme;



    public Filme(String codigo, String nome, int anoLancamento, int duracaoEmMinutos, List<CategoriaFilme> categoriaFilme) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.categoriaFilme = categoriaFilme;
    }
    public Filme(){this("","",0,0,null);}

    public boolean ehDaCategoria(CategoriaFilme categoria) {
        for (CategoriaFilme cat: this.categoriaFilme) {
            if (cat.equals(categoria)) {
                return true;
            }
        }
        return false;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}

