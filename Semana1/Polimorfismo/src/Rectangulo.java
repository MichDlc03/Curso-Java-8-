public class Rectangulo extends Calcular {
    public Rectangulo(int lado1, int lado2) {
        super(lado1, lado2);
    }

    @Override
    int AreaFigura() {
        return lado1 * lado2;
    }


}
