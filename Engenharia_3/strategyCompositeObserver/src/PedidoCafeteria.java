import java.util.List;

public class PedidoCafeteria implements Pedido {

    private AtendenteView v;
    private EstoqueCafeteria e;

    public void setV(AtendenteView view) {
        this.v = view;
    }

    @Override
    public void criarPedido() {
        // Implemente a lógica de criação de pedido para a cafeteria
    }
}
