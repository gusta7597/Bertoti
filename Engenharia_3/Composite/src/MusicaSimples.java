package src;
public class MusicaSimples implements Musica {
    private String nome;

    public MusicaSimples(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música: " + nome);
    }
}