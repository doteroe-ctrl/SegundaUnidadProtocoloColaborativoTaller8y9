package Personas;

public class Estudiante extends Persona {
    int matricula;

    @Override
    void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Matricula: "+matricula);
    }
}
