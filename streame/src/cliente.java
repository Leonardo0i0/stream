public class cliente {
    private String usuario;
    private int senha;
    private String email;
    private int numero;
    private int nivel;

    public String getUsuario() {
        return usuario;
    }

    public int getSenha() {
        return senha;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public int getNivel() {
        return nivel;
    }

    void trocarnome(String nome){
        usuario = nome;
    }
    void trocarsenha(int Senha){
        senha = Senha;
    }
    void trocaremail(String Email){
        email = Email;
    }
    void trocarnumero(int Numero){
        numero = Numero;
    }
    void trocarnivel(int Nivel){
        nivel = Nivel;
    }
}
