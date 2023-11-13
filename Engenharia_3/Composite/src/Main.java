package src;
public class Main {
    public static void main(String[] args) {

        MusicaSimples musica1 = new MusicaSimples("Stairway to Heaven");
        MusicaSimples musica2 = new MusicaSimples("Bohemian Rhapsody");
        MusicaSimples musica3 = new MusicaSimples("Imagine");

        ListaDeReproducao lista = new ListaDeReproducao();
        lista.adicionarMusica(musica1);
        lista.adicionarMusica(musica2);
        lista.adicionarMusica(musica3);

        musica1.tocar();

        lista.tocar();
    }
}