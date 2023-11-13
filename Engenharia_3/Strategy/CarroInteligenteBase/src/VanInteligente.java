public class VanInteligente implements AutoMovelInteligente {
    private boolean motorLigado = false;


    @Override
    public void ligarMotor() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("Motor ligado");
        } else {
            System.out.println("Motor Já ligado");
        }

    }


}