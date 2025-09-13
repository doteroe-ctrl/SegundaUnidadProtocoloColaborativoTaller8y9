package Empresa;

public class Gerente extends Empleado {
    String departamento;

    @Override
    void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.print("Departamento: "+departamento);
    }

}
