public class Repartidor{
    private String nombre;
    Vehiculo vehiculo;
    public Repartidor(String nombre) {
        this.nombre = nombre;
    }

    void tipoVehiculo() {
        System.out.println("Hola " + nombre);
        vehiculo.transporte();
    }
}
