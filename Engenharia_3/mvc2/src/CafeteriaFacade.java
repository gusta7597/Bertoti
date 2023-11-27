import java.util.List;

public class CafeteriaFacade {
    private EstoqueCafeteria estoque;
    private AtendenteView atendente;

    public CafeteriaFacade(EstoqueCafeteria estoque, AtendenteView atendente) {
        this.estoque = estoque;
        this.atendente = atendente;
    }

    public void realizarPedidoOnline(List<Produto> produtos) {
        Pedido pedidoOnline = new PedidoOnline();
        pedidoOnline.setV(atendente);
        realizarPedido(pedidoOnline, produtos);
    }

    public void realizarPedidoLocal(List<Produto> produtos) {
        Pedido pedidoCafeteria = new PedidoCafeteria();
        pedidoCafeteria.setV(atendente);
        realizarPedido(pedidoCafeteria, produtos);
    }

    private void realizarPedido(Pedido pedido, List<Produto> produtos) {
        pedido.criarPedido();
        // Lógica para processar o pedido e atualizar o estoque
        estoque.notificarObservers(List.of(pedido));
    }
}
