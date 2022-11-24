package model;

public class Livros {

    private String nomeLivro;
    private String autorLivro;
    private int NdeLivros;
    private int LivroId;

    public Livros(String nomeLivro, String autorLivro, int NdeLivros, int LivroId) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.NdeLivros = NdeLivros;
        this.LivroId= LivroId;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getNdeLivros() {
        return NdeLivros;
    }

    public void setNdeLivros(int NdeLivros) {
        this.NdeLivros = NdeLivros;
    }

    public int getLivroId() {
        return LivroId;
    }

    public void setLivroId(int LivroId) {
        this.LivroId = LivroId;
    }

}