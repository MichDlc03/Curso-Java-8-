public class Motocicleta implements Vehiculo{

    String marca;
    String color;

   Motocicleta(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    @Override
    public void transporte() {
        System.out.println("Tu Motocileta es un  " + marca + " Color:"  + color);
    }
}
