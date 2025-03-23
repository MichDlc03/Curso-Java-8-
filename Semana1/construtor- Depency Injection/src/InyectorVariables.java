public class InyectorVariables {
    static Repartidor getRepartidor() {
        //Crea los transportes y manda desde el inyector el transporte a asignar junto con el repartidor (nombre)
        Vehiculo automovil = new Automovil("KIRA","Blanco" );
        Vehiculo moto = new Automovil("TKJ","Negra" );
        return new Repartidor("Mickey", automovil);
    }
}
