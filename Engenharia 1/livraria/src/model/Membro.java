package model;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    
    private String nomeMembro;
    private String cpfMembro;
    private String enderecoMembro;
    private String emailMembro;
    private int idMembro;
    private ArrayList<Pedido> membroPedido;


    public Membro(String nomeMembro, String cpfMembro, String enderecoMembro,String emailMembro,int idMembro) {
        this.nomeMembro = nomeMembro;
        this.cpfMembro = cpfMembro;
        this.enderecoMembro = enderecoMembro;
        this.emailMembro = emailMembro;
        this.idMembro = idMembro;
    }

    public void criarPedido(Pedido membroPedido){this.membroPedido.add(membroPedido);}
    public void removePedido(Pedido membroPedido){this.membroPedido.remove(membroPedido);}
    
    public void setNomeMembro(String nomeMembro) { this.nomeMembro = nomeMembro; }
    public String getNomeMembro() { return nomeMembro; }

    public void setCpfMembro(String cpfMembro) { this.cpfMembro = cpfMembro; }
    public String getCpfMembro() { return cpfMembro; }

    public void setEnderecoMembro(String enderecoMembro) {this.enderecoMembro = enderecoMembro;}
    public String getEnderecoMembro() { return enderecoMembro; }

    public List getmembroPedido() {return membroPedido;}
    public void setmembroPedido(ArrayList<Pedido> membroPedido) {this.membroPedido = membroPedido;}

    public void setEmailMembro(String emailMembro) {this.emailMembro = emailMembro;}
    public String getEmailMembro() {return emailMembro;}

    public void setidMembro(int idMembro) {this.idMembro = idMembro;}
    public int getidMembro() {return idMembro;}
}