public class Repartidor{
    private String nombre;
    private Vehiculo vehiculo;

    Repartidor(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    void tipoVehiculo() {
        System.out.println("Hola " + nombre);
        vehiculo.transporte();
    }
}
