import java.util.ArrayList;
import java.util.List;

public interface CafeteriaSubject {
    void registrarObserver(ClienteObserver o);
    void notificarObservers(List<Pedido> pedidosProntos);
}
