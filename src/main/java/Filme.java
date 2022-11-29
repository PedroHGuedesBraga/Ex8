import java.util.List;

public class Filme {
    private String codigo;
    private String nome;
    private String anoLancamento;
    private int duracaoEmMinutos;

    private List <CategoriaFilme> CategoriaFilme;

    public Filme() {

    }

    public Filme(String codigo, String nome, String anoLancamento, int duracaoEmMinutos, CategoriaFilme categoriaFilme) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public boolean ehDaCategoria(CategoriaFilme categoria) {
        for (CategoriaFilme cat: this.CategoriaFilme) {
            if (cat ==categoria) {
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

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}

