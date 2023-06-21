import java.util.ArrayList;
import java.util.List;
public class filme {
    private String nome, sinopse, categoria;
    private int nota, tempo, ano;


    public String getNome() {
        return nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getNota() {
        return nota;
    }

    public int getAno() {
        return ano;
    }

    public int getTempo() {
        return tempo;
    }

    void trocarnome(String Nome) {
        nome = Nome;
    }
    void trocarsinopse( String Sinopse){
        sinopse = Sinopse;
    }
    void trocarcategoria(String Categoria){
        categoria = Categoria;
    }
    void trocarnota(int Nota){
        nota = Nota;
    }
    void trocartempo(int Tempo){
        tempo = Tempo;
    }
    void trocarano(int Ano){
        ano = Ano;
    }
}
