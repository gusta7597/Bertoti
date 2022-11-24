package model;

public class Bibliotecario {
        
    private String nomeBibliotecario;
    private String cpfBibliotecario;
    private int idBibliotecario;

    public Bibliotecario(String nomeBibliotecario, String cpfBibliotecario,int idBibliotecario) {
        this.nomeBibliotecario = nomeBibliotecario;
        this.cpfBibliotecario = cpfBibliotecario;
        this.idBibliotecario = idBibliotecario;
    }

    public void setNomeBibliotecario (String nomeBibliotecario ) { this.nomeBibliotecario  = nomeBibliotecario ; }
    public String getNomeBibliotecario () { return nomeBibliotecario ; }
    
    public void setCpfBibliotecario(String cpfBibliotecario) { this.cpfBibliotecario = cpfBibliotecario; }
    public String getCpfBibliotecario() { return cpfBibliotecario; }

    public void setidBibliotecario(int idBibliotecario) {this.idBibliotecario = idBibliotecario;}
    public int getidBibliotecario() {return idBibliotecario;}
}
