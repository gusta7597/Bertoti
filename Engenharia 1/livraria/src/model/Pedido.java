package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido{

    private int idPedido;
    private Livros livros;
    private Membro dadosMembro;
    private Bibliotecario dadosBibliotecario;

    public Pedido(int idPedido, Livros livros, Membro dadosMembro,Bibliotecario dadosBibliotecario) {
        this.idPedido = idPedido;
        this.livros = livros;
        this.dadosMembro = dadosMembro;
        this.dadosBibliotecario = dadosBibliotecario;
    }


    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Livros getLivros() {
        return livros;
    }

    public void setLivros(Livros livros) {
        this.livros = livros;
    }

    public Membro getDadosMembro() {
        return dadosMembro;
    }

    public void setDadosMembro(Membro dadosMembro) {
        this.dadosMembro = dadosMembro;
    }
    public Bibliotecario getDadosBibliotecario() {
        return dadosBibliotecario;
    }

    public void setDadosBibliotecario(Bibliotecario dadosBibliotecario) {
        this.dadosBibliotecario = dadosBibliotecario;
    }

}