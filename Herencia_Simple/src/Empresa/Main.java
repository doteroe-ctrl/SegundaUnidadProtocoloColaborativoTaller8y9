package Empresa;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Gerente g1 = new Gerente();

        e1.mostrarDetalles(); //metodo para mostrar la info de empleado con los atributos nombre y salario
        g1.mostrarDetalles(); //metodo para mostrar la info de gerente cuyos atributos nombre y salario hereda de empleado
        //y que agrega el departamento
    }

}
