public class filme {
    private String nome, sinopse, categoria;
    private int ano;
    private float tempo, nota;


    public String getNome() {
        return nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getNota() {
        return nota;
    }

    public int getAno() {
        return ano;
    }

    public float getTempo() {
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
    void trocarnota(float Nota){
        nota = Nota;
    }
    void trocartempo(float Tempo){
        tempo = Tempo;
    }
    void trocarano(int Ano){
        ano = Ano;
    }
}
