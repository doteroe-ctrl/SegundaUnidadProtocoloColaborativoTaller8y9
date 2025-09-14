package ejercio1;

public class EJemplo {

    public static void main(String[] args) {
        Persona p = new Persona("Fernada", 23);
        Empleado e = new Empleado("Alexander", 32, "Facrturacion");

        System.out.println("Detalles Persona:");
        p.mostrarDetalles();

        System.out.println("\nDetalles Empleado:");
        e.mostrarDetalles();
    }
}