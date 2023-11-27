import java.util.List;

public class AtendenteView implements ClienteObserver, Pedido {

    private Pedido pedido;
    private List<Pedido> listaPedidos;

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void atualizarListaPedidos(List<Produto> produtos) {
        // Implemente a lógica de atualização da lista de pedidos
    }

    public void imprimirRecibo() {
        // Implemente a lógica de impressão do recibo
    }

    @Override
    public void notificarPedidoPronto(List<Produto> produtos) {
        atualizarListaPedidos(produtos);
        imprimirRecibo();
    }

    @Override
    public void criarPedido() {
        // Implemente a lógica de criação de pedido
    }
}
