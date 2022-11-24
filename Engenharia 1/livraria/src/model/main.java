package model;
public class main{
public static void main(String[] args) {
    Membro membro1 = new Membro("paulo", "123.456.789-0", "mt longe", "gg@gmail.com", 1);
    Membro membro2 = new Membro("cleiton", "123.456.789-4", "mt perto", "g2g@gmail.com", 2);
    
    Bibliotecario b1 = new Bibliotecario("carlos", "321.213.231-4", 1);
    
    Loja loja = new Loja();
    loja.addMembro(membro1);
    loja.addMembro(membro2);
    loja.addBibliotecario(b1);

    Livros l1 = new Livros("A volta dos que nunca foram", "jorge", 5, 1);
    loja.addLivros(l1);

    Pedido pedido1 = new Pedido(1,l1,membro1,b1);

    System.out.println(pedido1);
}   
}