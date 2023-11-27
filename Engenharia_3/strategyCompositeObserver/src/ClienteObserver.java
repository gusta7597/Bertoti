import java.util.List;

public interface ClienteObserver {
    void notificarPedidoPronto(List<Produto> produtos);
}
