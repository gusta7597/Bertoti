import java.util.ArrayList;
import java.util.List;

public class EstoqueCafeteria implements CafeteriaSubject {

    private List<Produto> itens;
    private List<ClienteObserver> observadores;

    public EstoqueCafeteria() {
        this.itens = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrarObserver(ClienteObserver o) {
        observadores.add(o);
    }

    @Override
    public void notificarObservers(List<Pedido> pedidosProntos) {
        for (ClienteObserver observer : observadores) {
            observer.notificarPedidoPronto(pedidosProntos);
        }
    }

    public void adicionarItem(Produto item) {
        // Implemente a lógica de adição de item ao estoque
    }

    public Produto buscarItem(Produto item) {
        // Implemente a lógica de busca de item no estoque
        return null;
    }
}
