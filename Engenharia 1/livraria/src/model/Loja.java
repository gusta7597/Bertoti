package model;

import java.util.ArrayList;
import java.util.List;

public class Loja{

    private ArrayList<Membro> membros;
    private ArrayList<Bibliotecario> bibliotecario;
    private ArrayList<Livros> livros;

    public void loja(){
        membros = new ArrayList<Membro>();
        bibliotecario = new ArrayList<Bibliotecario>();
        livros = new ArrayList<Livros>();
    }
    

    public void addMembro(Membro membro){this.membros.add(membro);}
    public void deleteMembro(Membro membro){this.membros.remove(membro);}
    public List getMembros(){return membros;}
    public void setMembros(ArrayList<Membro> membros){this.membros = membros;}

    public void addBibliotecario(Bibliotecario bibliotecario){this.bibliotecario.add(bibliotecario);}
    public void deleteBibliotecario(Bibliotecario bibliotecario){this.bibliotecario.remove(bibliotecario);}
    public List getBibliotecario(){return bibliotecario;}
    public void setBibliotecario(ArrayList<Bibliotecario> bibliotecario){this.bibliotecario = bibliotecario;}

    public void addLivros(Livros livros){this.livros.add(livros);}
    public void deleteLivros(Livros livros){this.livros.remove(livros);}
    public List getLivros(){return livros;}
    public void setLivros(ArrayList<Livros> livros){this.livros = livros;}


}