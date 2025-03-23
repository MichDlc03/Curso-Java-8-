public class InyectorVariables {
    static void asignarVehiculo(Repartidor repartidor) {
//        repartidor.vehiculo = new Automovil("Audi", "Negro");

        //Llamos el metodo setter para enviar crea el objeto del transporte con sus respectivos parametros
        //El tipo de transporte se asigna desde la inyeccion
        repartidor.setVehiculo(new Motocicleta("RBQ", "Rojo"));
    }
}
