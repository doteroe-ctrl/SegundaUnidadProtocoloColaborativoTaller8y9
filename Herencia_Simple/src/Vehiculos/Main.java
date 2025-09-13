package Vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Chevrolet", 10);
        Coche c1 = new Coche("Logan", 20, 4);

        v1.mostrarInfo();
        c1.mostrarInfo();

    }

}
