public class serie extends filme{
    private int temporada, epsodio;

    public int getTemporada() {
        return temporada;
    }

    public int getEpsodio() {
        return epsodio;
    }

    void trocartemporada(int Temporada){
        temporada = Temporada;
    }
    void trocarepsodio(int Epsodio){
        epsodio = Epsodio;
    }
}
