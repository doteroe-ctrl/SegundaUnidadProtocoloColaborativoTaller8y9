
package ejercio1;


class Persona {
    private String Nombre;
    private int Edad;

 
    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    
    public void mostrarDetalles() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }
}


class Empleado extends Persona {
    private String departamento;

    
    public Empleado(String Nombre, int Edad, String departamento) {
        super(Nombre, Edad);
        this.departamento = departamento;
    }

   
    public String getDepartamento() {
        return departamento;
    }

    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}


