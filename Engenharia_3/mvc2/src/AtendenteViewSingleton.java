public class AtendenteViewSingleton {
    private static AtendenteView instance;

    private AtendenteViewSingleton() {
        // Construtor privado para impedir a criação direta da instância.
    }

    public static AtendenteView getInstance() {
        if (instance == null) {
            instance = new AtendenteView();
        }
        return instance;
    }
}
