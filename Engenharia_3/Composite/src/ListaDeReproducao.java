package src;
import java.util.ArrayList;
import java.util.List;

public class ListaDeReproducao implements Musica {
    private List<Musica> musicas;

    public ListaDeReproducao() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a lista de reprodução:");
        for (Musica musica : musicas) {
            musica.tocar();
        }
    }
}
