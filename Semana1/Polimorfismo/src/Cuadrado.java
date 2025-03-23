public class Cuadrado extends  Calcular {
    Cuadrado(int lado1) {
        super(lado1);
    }

    @Override
    int AreaFigura() {
        return lado1 * lado1;
    }


}
