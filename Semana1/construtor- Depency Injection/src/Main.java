//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Llamamos el metodo dede la clase inyector que asigna el repartidor junto con el transporte
        Repartidor repar = InyectorVariables.getRepartidor();
        repar.tipoVehiculo();
    }
}