class Automovil implements Vehiculo{
    String marca;
    String color;

    Automovil(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    @Override
    public void transporte() {
        System.out.println("Tu automovil es un " + marca + " Color: "  + color);
    }
}