public class CafeteriaFacade {
    private Cafeteira cafeteira;
    private MoinhoCafe moinhoCafe;

    public CafeteriaFacade() {
        this.cafeteira = new Cafeteira();
        this.moinhoCafe = new MoinhoCafe();
    }

    public void prepararCafe() {
        moinhoCafe.modoFino();
        moinhoCafe.modoRapido();
        cafeteira.fazerCafe();
    }
}