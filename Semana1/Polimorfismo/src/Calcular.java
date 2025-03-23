public abstract   class Calcular {

    int lado1;
    int lado2;

    //Constructor de mis atributos de la clase
    Calcular(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    Calcular(int lado1) {
        this.lado1 = lado1;
    }

    abstract  int AreaFigura ();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " lado1= " + lado1 +
                ", lado2= " + lado2;
    }
}
