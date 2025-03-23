import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calcular Figura1 = new Cuadrado(5);
        Calcular Figura2 = new Rectangulo(10, 7);
        Calcular Figura3 = new Triangulo(4, 6);

        List<Calcular> calcular = Arrays.asList(Figura1, Figura2, Figura3);


        for (Calcular c : calcular) {
            System.out.println(c + " Area = " + c.AreaFigura() );     }
        }

}

